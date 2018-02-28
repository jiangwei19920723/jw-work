package cn.jcloud.sso.service;

import java.util.List;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:38:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface ReBaseService<T> {
	public int save(T entity);
	public int delete(T entity);
	public List<T> get(T entity);
}
