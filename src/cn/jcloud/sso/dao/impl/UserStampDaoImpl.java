package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.UserStampDao;
import cn.jcloud.sso.entity.UserStamp;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 下午2:09:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class UserStampDaoImpl extends AbstractBaseDao<UserStamp> implements UserStampDao {

	@Override
	public int save(UserStamp userStamp) {
		String sql = "insert into sso_userstamp(path,userid,o) values(?,?,?)";
		return DBUtils.executeUpdate(sql, userStamp.getPath(), userStamp.getUserId(), userStamp.getO());
	}

	@Override
	public int update(UserStamp userStamp) {
		String sql = "update sso_userstamp set userid=?,o=? where path=?";
		return DBUtils.executeUpdate(sql, userStamp.getUserId(), userStamp.getO(), userStamp.getPath());
	}

	@Override
	public int delete(UserStamp userStamp) {
		return delete(userStamp.getPath());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from sso_userstamp where path=?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public UserStamp findById(String id) {
		String sql = "select * from sso_userstamp where path=?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public UserStamp convert(ResultSet rs) {
		UserStamp userStamp = new UserStamp();
		try {
			userStamp.setPath(rs.getString("path"));
			userStamp.setUserId(rs.getString("userid"));
			userStamp.setO(rs.getInt("o"));
			return userStamp;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected String getTableName() {
		return "sso_userstamp";
	}

	@Override
	protected String getSort() {
		return "o";
	}

}
