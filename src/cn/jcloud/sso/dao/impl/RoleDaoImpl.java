package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.RoleDao;
import cn.jcloud.sso.entity.Role;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 下午3:16:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RoleDaoImpl extends AbstractBaseDao<Role> implements RoleDao {

	@Override
	public int save(Role role) {
		String sql = "insert into SSO_ROLE(roleid,parentid,rolename,rolelevel,enabled,remark,o,creator,"
				+ "createtime,modifier,modifytime) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		Object[] objects = new Object[11];
		objects[0] = role.getRoleId();
		objects[1] = role.getParentId();
		objects[2] = role.getRoleName();
		objects[3] = role.getRoleLevel();
		objects[4] = role.getEnabled();
		objects[5] = role.getRemark();
		objects[6] = role.getO();
		objects[7] = role.getCreator();
		objects[8] = new Date(role.getCreateTime().getTime());
		objects[9] = role.getModifier();
		objects[10] = new Date(role.getModifyTime().getTime());
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int update(Role role) {
		String sql = "update SSO_ROLE set parentid=?,rolename=?,rolelevel=?,enabled=?,remark=?,o=?,creator=?,"
				+ "createtime=?,modifier=?,modifytime=? where roleid=?";
		Object[] objects = new Object[11];
		objects[0] = role.getParentId();
		objects[1] = role.getRoleName();
		objects[2] = role.getRoleLevel();
		objects[3] = role.getEnabled();
		objects[4] = role.getRemark();
		objects[5] = role.getO();
		objects[6] = role.getCreator();
		objects[7] = new Date(role.getCreateTime().getTime());
		objects[8] = role.getModifier();
		objects[9] = new Date(role.getModifyTime().getTime());
		objects[10] = role.getRoleId();
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int delete(Role role) {
		return delete(role.getRoleId());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_role where roleid = ?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Role findById(String id) {
		String sql = "select * from sso_role where roleid = ?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public Role convert(ResultSet rs) {
		Role role = new Role();
		try {
			role.setRoleId(rs.getString("roleid"));
			role.setParentId(rs.getString("parentid"));
			role.setRoleName(rs.getString("rolename"));
			role.setRoleLevel(rs.getInt("rolelevel"));
			role.setEnabled(rs.getInt("enabled"));
			role.setRemark(rs.getString("remark"));
			role.setO(rs.getInt("o"));
			role.setCreator(rs.getString("creator"));
			role.setCreateTime(new java.util.Date(rs.getDate("createtime").getTime()));
			role.setModifier(rs.getString("modifier"));
			role.setModifyTime(new java.util.Date(rs.getDate("modifytime").getTime()));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return role;
	}

	@Override
	protected String getTableName() {
		return "sso_role";
	}

	@Override
	protected String getSort() {
		return "o";
	}

	@Override
	public List<Role> findByParentId(String parentId) {
		String sql = "select * from sso_role where parentid = ?";
		return DBUtils.executeQuery(this, sql, parentId);
	}

}
