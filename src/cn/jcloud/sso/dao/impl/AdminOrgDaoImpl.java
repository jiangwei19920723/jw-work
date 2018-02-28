package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AdminOrgDao;
import cn.jcloud.sso.entity.AdminOrg;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午10:57:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class AdminOrgDaoImpl implements AdminOrgDao {

	@Override
	public int save(AdminOrg adminOrg) {
		String sql = "insert into sso_adminorg(adminid,orgid) values(?,?)";
		return DBUtils.executeUpdate(sql, adminOrg.getAdminId(),adminOrg.getOrgId());
	}

	@Override
	public int delete(AdminOrg adminOrg) {
		String sql = "delete from sso_adminorg where adminid=? and orgid=?";
		return DBUtils.executeUpdate(sql, adminOrg.getAdminId(),adminOrg.getOrgId());
	}

	@Override
	public List<AdminOrg> find(AdminOrg adminOrg) {
		if (adminOrg.getAdminId() != null && adminOrg.getOrgId() != null) {
			String sql = "select * from sso_adminorg where adminid=? and orgid=?";
			return DBUtils.executeQuery(this, sql, adminOrg.getAdminId(),adminOrg.getOrgId());
		}else if (adminOrg.getAdminId() != null) {
			String sql = "select * from sso_adminorg where adminid=?";
			return DBUtils.executeQuery(this, sql, adminOrg.getAdminId());
		}else if (adminOrg.getOrgId() != null) {
			String sql = "select * from sso_adminorg where orgid=?";
			return DBUtils.executeQuery(this, sql, adminOrg.getOrgId());
		}
		return null;
	}

	@Override
	public AdminOrg convert(ResultSet rs) {
		AdminOrg adminOrg = new AdminOrg();
		try {
			adminOrg.setAdminId(rs.getString("adminid"));
			adminOrg.setOrgId(rs.getString("orgid"));
			return adminOrg;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
