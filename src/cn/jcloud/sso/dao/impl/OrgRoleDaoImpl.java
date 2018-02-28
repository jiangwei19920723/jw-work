package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.OrgRoleDao;
import cn.jcloud.sso.entity.OrgRole;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午10:30:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class OrgRoleDaoImpl implements OrgRoleDao {

	@Override
	public int save(OrgRole orgRole) {
		String sql = "insert into sso_orgrole(orgid,roleid) values(?,?)";
		return DBUtils.executeUpdate(sql, orgRole.getOrgId(),orgRole.getRoleId());
	}

	@Override
	public int delete(OrgRole orgRole) {
		String sql = "delete from sso_orgrole where orgid=? and roleid=?";
		return DBUtils.executeUpdate(sql, orgRole.getOrgId(),orgRole.getRoleId());
	}

	@Override
	public List<OrgRole> find(OrgRole orgRole) {
		if (orgRole.getOrgId() != null && orgRole.getRoleId() != null) {
			String sql = "select * from sso_orgrole where orgid=? and roleid=?";
			return DBUtils.executeQuery(this, sql, orgRole.getOrgId(), orgRole.getRoleId());
		} else if (orgRole.getOrgId() != null) {
			String sql = "select * from sso_orgrole where orgid=?";
			return DBUtils.executeQuery(this, sql, orgRole.getOrgId());
		} else if (orgRole.getRoleId() != null) {
			String sql = "select * from sso_orgrole where roleid=?";
			return DBUtils.executeQuery(this, sql, orgRole.getRoleId());
		}
		return null;
	}

	@Override
	public OrgRole convert(ResultSet rs) {
		OrgRole orgRole = new OrgRole();
		try {
			orgRole.setOrgId(rs.getString("orgid"));
			orgRole.setRoleId(rs.getString("roleid"));
			return orgRole;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
