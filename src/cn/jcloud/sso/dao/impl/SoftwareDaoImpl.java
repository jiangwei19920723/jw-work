package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.SoftwareDao;
import cn.jcloud.sso.entity.Software;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 下午4:09:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SoftwareDaoImpl extends AbstractBaseDao<Software> implements SoftwareDao {

	@Override
	public int save(Software software) {
		Object[] objects = new Object[7];
		objects[0] = software.getSoftwareId();
		objects[1] = software.getSoftwareName();
		objects[2] = software.getSoftwareLoadIp();
		objects[3] = software.getSoftwareCallbackIp();
		objects[4] = software.getSoftwareKey();
		objects[5] = new Date(software.getTime().getTime());
		objects[6] = software.getChanger();
		String sql = "insert into SSO_SOFTWARE(softwareid,softwarename,softwareloadip,softwarecallbackip,"
				+ "softwarekey,time,changer) VALUES(?,?,?,?,?,?,?)";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int update(Software software) {
		Object[] objects = new Object[7];
		objects[0] = software.getSoftwareName();
		objects[1] = software.getSoftwareLoadIp();
		objects[2] = software.getSoftwareCallbackIp();
		objects[3] = software.getSoftwareKey();
		objects[4] = new Date(software.getTime().getTime());
		objects[5] = software.getChanger();
		objects[6] = software.getSoftwareId();
		String sql = "update SSO_SOFTWARE set softwarename=?,softwareloadip=?,softwarecallbackip=?,"
				+ "softwarekey=?,time=?,changer=? where softwareid=?";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int delete(Software software) {
		return delete(software.getSoftwareId());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_software where softwareid=?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Software findById(String id) {
		String sql = "select * from sso_software where softwareid=?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public Software convert(ResultSet rs) {
		Software software = new Software();
		try {
			software.setSoftwareId(rs.getString("softwareid"));
			software.setSoftwareName(rs.getString("softwarename"));
			software.setSoftwareLoadIp(rs.getString("softwareloadip"));
			software.setSoftwareCallbackIp(rs.getString("softwarecallbackip"));
			software.setSoftwareKey(rs.getString("softwarekey"));
			software.setTime(new java.util.Date(rs.getDate("time").getTime()));
			software.setChanger(rs.getString("changer"));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return software;
	}

	@Override
	protected String getTableName() {
		return "SSO_SOFTWARE";
	}

	@Override
	protected String getSort() {
		return "softwareid";
	}

}
