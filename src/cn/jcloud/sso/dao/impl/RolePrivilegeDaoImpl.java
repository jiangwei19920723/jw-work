package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.RolePrivilegeDao;
import cn.jcloud.sso.entity.RolePrivilege;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月24日 下午4:48:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class RolePrivilegeDaoImpl implements RolePrivilegeDao {

	@Override
	public int save(RolePrivilege rolePrivilege) {
		String sql = "insert into sso_roleprivilege(roleid,domain,type,rid,pid) values(?,?,?,?,?)";
		return DBUtils.executeUpdate(sql, rolePrivilege.getRoleId(), rolePrivilege.getDoMain(), rolePrivilege.getType(),
				rolePrivilege.getrId(), rolePrivilege.getpId());
	}

	@Override
	public int update(RolePrivilege rolePrivilege) {
		String sql = "update sso_roleprivilege set domain=?,type=? where rid=? and pid=? and roleid=?";
		return DBUtils.executeUpdate(sql, rolePrivilege.getDoMain(), rolePrivilege.getType(), rolePrivilege.getrId(),
				rolePrivilege.getpId(), rolePrivilege.getRoleId());
	}

	/**
	 * 只需要roleId,rId,Pid
	 */
	@Override
	public int delete(RolePrivilege rolePrivilege) {
		String sql = "delete from sso_roleprivilege where roleid=? and rid=? and pid=?";
		return DBUtils.executeUpdate(sql, rolePrivilege.getRoleId(), rolePrivilege.getrId(), rolePrivilege.getpId());
	}

	@Override
	public RolePrivilege convert(ResultSet rs) {
		RolePrivilege rolePrivilege = new RolePrivilege();
		try {
			rolePrivilege.setRoleId(rs.getString("roleid"));
			rolePrivilege.setDoMain(rs.getString("domain"));
			rolePrivilege.setType(rs.getInt("type"));
			rolePrivilege.setrId(rs.getString("rid"));
			rolePrivilege.setpId(rs.getString("pid"));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rolePrivilege;
	}

	/**
	 * 至少需要roleid,rid,pid之一，也可以使用多个
	 */
	@Override
	public List<RolePrivilege> find(RolePrivilege rolePrivilege) {
		if (rolePrivilege.getRoleId() != null && rolePrivilege.getrId() != null && rolePrivilege.getpId() != null) {
			String sql = "select * from sso_roleprivilege where roleid=? and rid=? and pid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getRoleId(), rolePrivilege.getrId(),
					rolePrivilege.getpId());
		} else if (rolePrivilege.getRoleId() != null && rolePrivilege.getrId() != null) {
			String sql = "select * from sso_roleprivilege where roleid=? and rid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getRoleId(), rolePrivilege.getrId());
		} else if (rolePrivilege.getrId() != null && rolePrivilege.getpId() != null) {
			String sql = "select * from sso_roleprivilege where rid=? and pid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getrId(), rolePrivilege.getpId());
		} else if (rolePrivilege.getRoleId() != null && rolePrivilege.getpId() != null) {
			String sql = "select * from sso_roleprivilege where roleid=? and pid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getRoleId(), rolePrivilege.getpId());
		} else if (rolePrivilege.getRoleId() != null) {
			String sql = "select * from sso_roleprivilege where roleid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getRoleId());
		} else if (rolePrivilege.getrId() != null) {
			String sql = "select * from sso_roleprivilege where rid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getrId());
		} else if (rolePrivilege.getpId() != null) {
			String sql = "select * from sso_roleprivilege where pid=?";
			return DBUtils.executeQuery(this, sql, rolePrivilege.getpId());
		}
		return null;
	}

}
