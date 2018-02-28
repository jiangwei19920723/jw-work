package cn.jcloud.sso.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.UserRoleDao;
import cn.jcloud.sso.entity.UserRole;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 下午1:56:42
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class UserRoleDaoImpl implements UserRoleDao {

	@Override
	public int save(UserRole userRole) {
		String sql = "insert into sso_userrole(userid,roleid,hold,expireddate) values(?,?,?,?)";
		return DBUtils.executeUpdate(sql, userRole.getUserId(), userRole.getRoleId(), userRole.getHold(),
				new Date(userRole.getExpiredDate().getTime()));
	}

	@Override
	public int update(UserRole userRole) {
		String sql = "update sso_userrole set hold=?,expireddate=? where userid=? and roleid=?";
		return DBUtils.executeUpdate(sql, userRole.getHold(), new Date(userRole.getExpiredDate().getTime()), userRole.getUserId(),
				userRole.getRoleId());
	}

	@Override
	public int delete(UserRole userRole) {
		String sql = "delete from sso_userrole where userid=? and roleid=?";
		return DBUtils.executeUpdate(sql, userRole.getUserId(), userRole.getRoleId());
	}

	@Override
	public List<UserRole> find(UserRole userRole) {
		if (userRole.getUserId() != null && userRole.getRoleId() != null) {
			String sql = "select * from sso_userrole where userid=? and roleid=?";
			return DBUtils.executeQuery(this, sql, userRole.getUserId(), userRole.getRoleId());
		} else if (userRole.getUserId() != null) {
			String sql = "select * from sso_userrole where userid=?";
			return DBUtils.executeQuery(this, sql, userRole.getUserId());

		} else if (userRole.getRoleId() != null) {
			String sql = "select * from sso_userrole where roleid=?";
			return DBUtils.executeQuery(this, sql, userRole.getRoleId());
		}
		return null;
	}

	@Override
	public UserRole convert(ResultSet rs) {
		UserRole userRole = new UserRole();
		try {
			userRole.setUserId(rs.getString("userid"));
			userRole.setRoleId(rs.getString("roleid"));
			userRole.setHold(rs.getInt("hold"));
			userRole.setExpiredDate(new java.util.Date(rs.getDate("expireddate").getTime()));
			return userRole;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
