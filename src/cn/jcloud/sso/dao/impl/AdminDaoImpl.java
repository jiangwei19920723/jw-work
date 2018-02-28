package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.AdminDao;
import cn.jcloud.sso.entity.Admin;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 下午3:54:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminDaoImpl extends AbstractBaseDao<Admin> implements AdminDao {

	@Override
	public int save(Admin admin) {
		Object[] objects = new Object[8];
		objects[0] = admin.getAdminId();
		objects[1] = admin.getAdminName();
		objects[2] = admin.getAuthenabled();
		objects[3] = admin.getRemark();
		objects[4] = admin.getCreator();
		objects[5] = new Date(admin.getCreateTime().getTime());
		objects[6] = admin.getModifier();
		objects[7] = new Date(admin.getModifyTime().getTime());
		String sql = "insert into SSO_ADMIN(adminid,adminname,authenabled,remark,creator,createtime,"
				+ "modifier,modifytime) VALUES(?,?,?,?,?,?,?,?)";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int update(Admin admin) {
		Object[] objects = new Object[8];
		objects[0] = admin.getAdminName();
		objects[1] = admin.getAuthenabled();
		objects[2] = admin.getRemark();
		objects[3] = admin.getCreator();
		objects[4] = new Date(admin.getCreateTime().getTime());
		objects[5] = admin.getModifier();
		objects[6] = new Date(admin.getModifyTime().getTime());
		objects[7] = admin.getAdminId();
		String sql = "update SSO_ADMIN set adminname=?,authenabled=?,remark=?,creator=?,createtime=?,"
				+ "modifier=?,modifytime=? where adminid = ?";
		return DBUtils.executeUpdate(sql, objects);
	}

	@Override
	public int delete(Admin admin) {
		return delete(admin.getAdminId());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_admin where adminid = ?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Admin findById(String id) {
		String sql = "select * from sso_admin where adminid = ?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public Admin convert(ResultSet rs) {
		Admin admin = new Admin();
		try {
			admin.setAdminId(rs.getString("adminid"));
			admin.setAdminName(rs.getString("adminname"));
			admin.setAuthenabled(rs.getInt("authenabled"));
			admin.setRemark(rs.getString("remark"));
			admin.setCreator(rs.getString("creator"));
			admin.setCreateTime(new java.util.Date(rs.getDate("createtime").getTime()));
			admin.setModifier(rs.getString("modifier"));
			admin.setModifyTime(new java.util.Date(rs.getDate("modifytime").getTime()));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return admin;
	}

	@Override
	protected String getTableName() {
		return "sso_admin";
	}

	@Override
	protected String getSort() {
		return "adminid";
	}

}
