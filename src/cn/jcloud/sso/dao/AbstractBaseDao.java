package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DBUtils;
import cn.jcloud.sso.common.RowConverter;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午4:59:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class AbstractBaseDao<T> implements BaseDao<T>,RowConverter<T> {
	protected abstract String getTableName();
	protected abstract String getSort();
	@Override
	public List<T> findAll() {
		return DBUtils.executeQuery(this, "select * from "+getTableName());
	}
	@Override
	public List<T> find(Pager p){
		int total = DBUtils.executeQueryWithUniqueResult("select count(*) from " + getTableName());
		p.setTotal(total);
		String sql = "select * from ( " +
					    "select tmp.*,rownum rn " + 
					        "from (" +
					             "select * from " + getTableName() + " order by " + getSort() + ") tmp) tmp1 " + 
					  "where tmp1.rn>" + p.getBegin() + " and tmp1.rn<=" + p.getEnd();
		return DBUtils.executeQuery(this, sql);
	}
}
