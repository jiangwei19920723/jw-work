package cn.jcloud.sso.dao;

import java.util.List;
import java.util.Map;

import cn.jcloud.sso.common.RowConverter;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:55:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface ReBaseDao<T> extends RowConverter<T> {
	/**
	 * ����ʵ��
	 * @param entity
	 * @return
	 */
	public int save(T entity);
	/**
	 * �޸�ʵ��
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	/**
	 * ɾ��ʵ��
	 * @param entity
	 * @return
	 */
	public int delete(T entity);
	/**
	 * ��ѯʵ��
	 * @param entity
	 * @return
	 */
	public List<T> find(T entity);
	
}
