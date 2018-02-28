package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.UserTypeDao;
import cn.jcloud.sso.entity.UserType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午1:49:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserTypeDaoImpl extends AbstractBaseDao<UserType> implements UserTypeDao {

	@Override
	public int save(UserType usertype) {
		String sql = "insert into sso_usertype(usertype,usertypename) values(?,?)";
		return DBUtils.executeUpdate(sql, usertype.getUserType(),usertype.getUserTypeName());
	}

	@Override
	public int update(UserType usertype) {
		String sql = "update sso_usertype set usertypename=? where usertype=?";
		return DBUtils.executeUpdate(sql, usertype.getUserTypeName(),usertype.getUserType());
	}

	@Override
	public int delete(UserType usertype) {
		return delete(usertype.getUserType());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_usertype where usertype=?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public UserType findById(String id) {
		String sql = "select * from sso_usertype where usertype=?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public UserType convert(ResultSet rs) {
		UserType userType = new UserType();
		try {
			userType.setUserType(rs.getString("usertype"));
			userType.setUserTypeName(rs.getString("usertypename"));
			return userType;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected String getTableName() {
		return "sso_usertype";
	}

	@Override
	protected String getSort() {
		return "usertype";
	}

}
