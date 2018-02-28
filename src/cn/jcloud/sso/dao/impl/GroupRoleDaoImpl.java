package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.GroupRoleDao;
import cn.jcloud.sso.entity.GroupRole;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午10:42:42
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class GroupRoleDaoImpl implements GroupRoleDao {

	@Override
	public int save(GroupRole groupRole) {
		String sql = "insert into sso_grouprole(groupid,roleid) values(?,?)";
		return DBUtils.executeUpdate(sql, groupRole.getGroupId(), groupRole.getRoleId());
	}

	@Override
	public int delete(GroupRole groupRole) {
		String sql = "delete from sso_grouprole where groupid=? and roleid=?";
		return DBUtils.executeUpdate(sql, groupRole.getGroupId(), groupRole.getRoleId());
	}

	@Override
	public List<GroupRole> find(GroupRole groupRole) {
		if (groupRole.getGroupId() != null && groupRole.getRoleId() != null) {
			String sql = "select * from sso_grouprole where groupid=? and roleid=?";
			return DBUtils.executeQuery(this, sql, groupRole.getGroupId(), groupRole.getRoleId());
		} else if (groupRole.getGroupId() != null) {
			String sql = "select * from sso_grouprole where groupid=?";
			return DBUtils.executeQuery(this, sql, groupRole.getGroupId());
		} else if (groupRole.getRoleId() != null) {
			String sql = "select * from sso_grouprole where roleid=?";
			return DBUtils.executeQuery(this, sql, groupRole.getRoleId());
		}
		return null;
	}

	@Override
	public GroupRole convert(ResultSet rs) {
		GroupRole groupRole = new GroupRole();
		try {
			groupRole.setGroupId(rs.getString("groupid"));
			groupRole.setRoleId(rs.getString("roleid"));
			return groupRole;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
