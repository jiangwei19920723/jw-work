package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.OrgleaderDao;
import cn.jcloud.sso.entity.Orgleader;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月25日 上午9:52:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class OrgleaderDaoImpl implements OrgleaderDao {

	@Override
	public int save(Orgleader orgleader) {
		String sql = "insert into sso_orgleader(orgid,userid,leadertype) values(?,?,?)";
		return DBUtils.executeUpdate(sql, orgleader.getOrgId(),orgleader.getUserId(),orgleader.getLeaderType());
	}

	@Override
	public int update(Orgleader orgleader) {
		String sql = "update sso_orgleader set leadertype=? where orgid=? and userid=?";
		return DBUtils.executeUpdate(sql, orgleader.getLeaderType(),orgleader.getOrgId(),orgleader.getUserId());
	}
	/**
	 * 至少需要orgid,userid
	 */
	@Override
	public int delete(Orgleader orgleader) {
		String sql = "delete from sso_orgleader where orgid=? and userid=?";
		return DBUtils.executeUpdate(sql, orgleader.getOrgId(),orgleader.getUserId());
	}

	/**
	 * 需要orgid,userid至少一个
	 */
	@Override
	public List<Orgleader> find(Orgleader orgleader) {
		if (orgleader.getOrgId() != null && orgleader.getUserId() != null) {
			String sql = "select * from sso_orgleader where orgid=? and userid=?";
			return DBUtils.executeQuery(this, sql, orgleader.getOrgId(), orgleader.getUserId());
		} else if (orgleader.getOrgId() != null) {
			String sql = "select * from sso_orgleader where orgid=?";
			return DBUtils.executeQuery(this, sql, orgleader.getOrgId());
		} else if (orgleader.getUserId() != null) {
			String sql = "select * from sso_orgleader where userid=?";
			return DBUtils.executeQuery(this, sql, orgleader.getUserId());
		}
		return null;
	}

	@Override
	public Orgleader convert(ResultSet rs) {
		Orgleader orgleader = new Orgleader();
		try {
			orgleader.setOrgId(rs.getString("orgid"));
			orgleader.setUserId(rs.getString("userid"));
			orgleader.setLeaderType(rs.getInt("leadertype"));
			return orgleader;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
