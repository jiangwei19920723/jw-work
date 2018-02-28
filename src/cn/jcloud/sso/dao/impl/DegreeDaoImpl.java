package cn.jcloud.sso.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.dao.AbstractBaseDao;
import cn.jcloud.sso.dao.DegreeDao;
import cn.jcloud.sso.entity.Degree;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午11:29:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DegreeDaoImpl extends AbstractBaseDao<Degree> implements DegreeDao {

	@Override
	public int save(Degree degree) {
		String sql = "insert into sso_degree(degree,degreename) values(?,?)";
		return DBUtils.executeUpdate(sql, degree.getDegree(),degree.getDegreeName());
	}

	@Override
	public int update(Degree degree) {
		String sql = "update sso_degree set degreename=? where degree=?";
		return DBUtils.executeUpdate(sql, degree.getDegreeName(),degree.getDegree());
	}

	@Override
	public int delete(Degree degree) {
		return delete(degree.getDegree());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from sso_degree where degree=?";
		return DBUtils.executeUpdate(sql, id);
	}

	@Override
	public Degree fingByid(int id) {
		String sql = "select * from sso_degree where degree=?";
		return DBUtils.executeQuery(this, sql, id).get(0);
	}

	@Override
	public Degree convert(ResultSet rs) {
		Degree degree = new Degree();
		try {
			degree.setDegree(rs.getInt("degree"));
			degree.setDegreeName(rs.getString("degreename"));
			return degree;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected String getTableName() {
		return "sso_degree";
	}

	@Override
	protected String getSort() {
		return "degree";
	}

}
