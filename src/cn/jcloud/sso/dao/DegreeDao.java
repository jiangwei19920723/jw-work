package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.Degree;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午11:28:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DegreeDao extends BaseDao<Degree> {
	/**
	 * 未实现
	 */
	@Override
	default Degree findById(String id) {
		return null;
	}
	/**
	 * 未实现
	 */
	@Override
	default int delete(String id) {
		return 0;
	}
	public Degree fingByid(int id);
	public int delete(int id);
}
