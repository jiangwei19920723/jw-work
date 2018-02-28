package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.OrgTypeDao;
import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午10:22:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgTypeDaoImpl implements OrgTypeDao {

	@Override
	public int save(OrgType orgType) {
		String sql = "insert into sso_orgtype(orgtype,orgtypename) values(?,?)";
		return DBUtils.executeUpdate(sql, orgType.getOrgType(),orgType.getOrgTypeName());
	}

	@Override
	public int update(OrgType orgType) {
		String sql = "update sso_orgtype set orgtypename=? where orgtype=?";
		return DBUtils.executeUpdate(sql, orgType.getOrgTypeName(),orgType.getOrgType());
	}

	@Override
	public int delete(OrgType orgType) {
		String sql = "delete from sso_orgtype where orgtype=?";
		return DBUtils.executeUpdate(sql, orgType.getOrgType());
	}

	@Override
	public OrgType convert(ResultSet rs) {
		OrgType orgType = new OrgType();
		try {
			orgType.setOrgType(rs.getString("orgtype"));
			orgType.setOrgTypeName(rs.getString("orgtypename"));
			return orgType;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public OrgType find(String orgtype) {
		String sql = "select * from sso_orgtype where orgtype=?";
		return DBUtils.executeQuery(this, sql, orgtype).get(0);
	}

}
