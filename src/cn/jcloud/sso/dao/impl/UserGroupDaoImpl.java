package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.UserGroupDao;
import cn.jcloud.sso.entity.UserGroup;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 下午2:17:29
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class UserGroupDaoImpl implements UserGroupDao {

	@Override
	public int save(UserGroup userGroup) {
		String sql = "insert into sso_usergroup(groupid,userid,expireddate) values(?,?,?)";
		return DBUtils.executeUpdate(sql, userGroup.getGroupId(), userGroup.getUserId(),
				new Date(userGroup.getExpiredDate().getTime()));
	}

	@Override
	public int update(UserGroup userGroup) {
		String sql = "update sso_usergroup set expireddate=? where groupid=? and userid=?";
		return DBUtils.executeUpdate(sql, new Date(userGroup.getExpiredDate().getTime()), userGroup.getGroupId(),
				userGroup.getUserId());
	}

	@Override
	public int delete(UserGroup userGroup) {
		String sql = "delete from sso_usergroup where groupid=? and userid=?";
		return DBUtils.executeUpdate(sql, userGroup.getGroupId(), userGroup.getUserId());
	}

	@Override
	public List<UserGroup> find(UserGroup userGroup) {
		if (userGroup.getGroupId() != null && userGroup.getUserId() != null) {
			String sql = "select * from sso_usergroup where groupid=? and userid=?";
			return DBUtils.executeQuery(this, sql, userGroup.getGroupId(), userGroup.getUserId());
		} else if (userGroup.getGroupId() != null) {
			String sql = "select * from sso_usergroup where groupid=?";
			return DBUtils.executeQuery(this, sql, userGroup.getGroupId());
		} else if (userGroup.getUserId() != null) {
			String sql = "select * from sso_usergroup where userid=?";
			return DBUtils.executeQuery(this, sql, userGroup.getUserId());
		}
		return null;
	}

	@Override
	public UserGroup convert(ResultSet rs) {
		UserGroup userGroup = new UserGroup();
		try {
			userGroup.setUserId(rs.getString("userid"));
			userGroup.setGroupId(rs.getString("groupid"));
			userGroup.setExpiredDate(new java.util.Date(rs.getDate("expireddate").getTime()));
			return userGroup;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
