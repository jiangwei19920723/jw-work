package cn.jcloud.sso.service;

import java.util.List;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:38:41 
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
