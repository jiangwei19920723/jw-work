package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.UserSoftwareDao;
import cn.jcloud.sso.entity.UserSoftware;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月30日 下午2:39:36
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class UserSoftwareDaoImpl implements UserSoftwareDao {

	@Override
	public int save(UserSoftware userSoftware) {
		String sql = "insert into sso_usersoftware(userid,softwareid) values(?,?)";
		return DBUtils.executeUpdate(sql, userSoftware.getUserId(), userSoftware.getSoftwareId());
	}

	/**
	 * 未实现
	 */
	@Override
	public int update(UserSoftware userSoftware) {
		return 0;
	}

	@Override
	public int delete(UserSoftware userSoftware) {
		String sql = "delete from sso_usersoftware where userid=? and softwareid=?";
		return DBUtils.executeUpdate(sql, userSoftware.getUserId(), userSoftware.getSoftwareId());
	}

	@Override
	public List<UserSoftware> find(UserSoftware userSoftware) {
		if (userSoftware.getUserId() != null && userSoftware.getSoftwareId() != null) {
			String sql = "select * from sso_usersoftware where userid=? and softwareid=?";
			return DBUtils.executeQuery(this, sql, userSoftware.getUserId(), userSoftware.getSoftwareId());
		} else if (userSoftware.getUserId() != null) {
			String sql = "select * from sso_usersoftware where userid=?";
			return DBUtils.executeQuery(this, sql, userSoftware.getUserId());
		} else if (userSoftware.getSoftwareId() != null) {
			String sql = "select * from sso_usersoftware where softwareid=?";
			return DBUtils.executeQuery(this, sql, userSoftware.getSoftwareId());
		}
		return null;
	}

	@Override
	public UserSoftware convert(ResultSet rs) {
		UserSoftware userSoftware = new UserSoftware();
		try {
			userSoftware.setUserId(rs.getString("userid"));
			userSoftware.setSoftwareId(rs.getString("softwareid"));
			return userSoftware;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
