package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AdminRoleDao;
import cn.jcloud.sso.entity.AdminRole;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午11:07:20
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class AdminRoleDaoImpl implements AdminRoleDao {

	@Override
	public int save(AdminRole adminRole) {
		String sql = "insert into sso_adminrole(adminid,roleid) values(?,?)";
		return DBUtils.executeUpdate(sql, adminRole.getAdminId(),adminRole.getRoleId());
	}

	@Override
	public int delete(AdminRole adminRole) {
		String sql = "delete from sso_adminrole where adminid=? and roleid=?";
		return DBUtils.executeUpdate(sql, adminRole.getAdminId(),adminRole.getRoleId());
	}

	@Override
	public List<AdminRole> find(AdminRole adminRole) {
		if (adminRole.getAdminId() != null && adminRole.getRoleId() != null) {
			String sql = "select * from sso_adminrole where adminid=? and roleid=?";
			return DBUtils.executeQuery(this, sql, adminRole.getAdminId(), adminRole.getRoleId());
		} else if (adminRole.getAdminId() != null) {
			String sql = "select * from sso_adminrole where adminid=?";
			return DBUtils.executeQuery(this, sql, adminRole.getAdminId());
		} else if (adminRole.getRoleId() != null) {
			String sql = "select * from sso_adminrole where roleid=?";
			return DBUtils.executeQuery(this, sql, adminRole.getRoleId());
		}
		return null;
	}

	@Override
	public AdminRole convert(ResultSet rs) {
		AdminRole adminRole = new AdminRole();
		try {
			adminRole.setAdminId(rs.getString("adminid"));
			adminRole.setRoleId(rs.getString("roleid"));
			return adminRole;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
