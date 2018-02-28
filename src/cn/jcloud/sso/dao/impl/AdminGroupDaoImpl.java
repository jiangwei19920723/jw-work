package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AdminGroupDao;
import cn.jcloud.sso.entity.AdminGroup;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午11:18:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class AdminGroupDaoImpl implements AdminGroupDao {

	@Override
	public int save(AdminGroup adminGroup) {
		String sql = "insert into sso_admingroup(adminid,groupid) values(?,?)";
		return DBUtils.executeUpdate(sql, adminGroup.getAdminId(),adminGroup.getGroupId());
	}

	@Override
	public int delete(AdminGroup adminGroup) {
		String sql = "delete from sso_admingroup where adminid=? and groupid=?";
		return DBUtils.executeUpdate(sql, adminGroup.getAdminId(),adminGroup.getGroupId());
	}

	@Override
	public List<AdminGroup> find(AdminGroup adminGroup) {
		if (adminGroup.getAdminId() != null && adminGroup.getGroupId() != null) {
			String sql = "select * from sso_admingroup where adminid=? and groupid=?";
			return DBUtils.executeQuery(this, sql, adminGroup.getAdminId(), adminGroup.getGroupId());
		} else if (adminGroup.getAdminId() != null) {
			String sql = "select * from sso_admingroup where adminid=?";
			return DBUtils.executeQuery(this, sql, adminGroup.getAdminId());

		} else if (adminGroup.getGroupId() != null) {
			String sql = "select * from sso_admingroup where groupid=?";
			return DBUtils.executeQuery(this, sql, adminGroup.getGroupId());
		}
		return null;
	}

	@Override
	public AdminGroup convert(ResultSet rs) {
		AdminGroup adminGroup = new AdminGroup();
		try {
			adminGroup.setAdminId(rs.getString("adminid"));
			adminGroup.setGroupId(rs.getString("groupid"));
			return adminGroup;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
