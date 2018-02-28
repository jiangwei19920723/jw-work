package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.Degree;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:41:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DegreeService extends BaseService<Degree> {
	public int deleteById(int id);
	public Degree getById(int id);
	/**
	 * 空实现
	 */
	@Override
	default int deleteById(String id) {
		return 0;
	}
	/**
	 * 空实现
	 */
	@Override
	default Degree getById(String id) {
		return null;
	}
}
