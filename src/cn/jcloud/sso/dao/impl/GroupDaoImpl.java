package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.GroupDao;
import cn.jcloud.sso.entity.Group;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 下午3:35:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupDaoImpl extends AbstractBaseDao<Group> implements GroupDao {

	@Override
	public int save(Group group) {
		Object[] objects = new Object[11];
		objects[0] = group.getGroupId();
		objects[1] = group.getParentId();
		objects[2] = group.getGroupName();
		objects[3] = group.getGroupLevel();
		objects[4] = group.getEnabled();
		objects[5] = group.getRemark();
		objects[6] = group.getO();
		objects[7] = group.getCreator();
		objects[8] = new Date(group.getCreateTime().getTime());
		objects[9] = group.getModifier();
		objects[10] = new Date(group.getModifyTime().getTime());
		String sql = "insert into SSO_GROUP(groupid,parentid,groupname,grouplevel,enabled,remark,o,creator,"
				+ "createtime,modifier,modifytime) VALUES(?,?,?,?,?,?,?,?,?,?,?) ";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int update(Group group) {
		Object[] objects = new Object[11];
		objects[0] = group.getParentId();
		objects[1] = group.getGroupName();
		objects[2] = group.getGroupLevel();
		objects[3] = group.getEnabled();
		objects[4] = group.getRemark();
		objects[5] = group.getO();
		objects[6] = group.getCreator();
		objects[7] = new Date(group.getCreateTime().getTime());
		objects[8] = group.getModifier();
		objects[9] = new Date(group.getModifyTime().getTime());
		objects[10] = group.getGroupId();
		String sql = "update SSO_GROUP set parentid=?,groupname=?,grouplevel=?,enabled=?,remark=?,o=?,"
				+ "creator=?,createtime=?,modifier=?,modifytime=? where groupid = ?";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int delete(Group group) {
		return delete(group.getGroupId());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_group where groupid = ?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Group findById(String id) {
		String sql = "select * from sso_group where groupid = ?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public Group convert(ResultSet rs) {
		Group group = new Group();
		try {
			group.setGroupId(rs.getString("groupid"));
			group.setParentId(rs.getString("parentid"));
			group.setGroupName(rs.getString("groupname"));
			group.setGroupLevel(rs.getInt("grouplevel"));
			group.setEnabled(rs.getInt("enabled"));
			group.setRemark(rs.getString("remark"));
			group.setO(rs.getInt("o"));
			group.setCreator(rs.getString("creator"));
			group.setCreateTime(new java.util.Date(rs.getDate("createtime").getTime()));
			group.setModifier(rs.getString("modifier"));
			group.setModifyTime(new java.util.Date(rs.getDate("modifytime").getTime()));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return group;
	}

	@Override
	protected String getTableName() {
		return "sso_group";
	}

	@Override
	protected String getSort() {
		return "o";
	}

}
