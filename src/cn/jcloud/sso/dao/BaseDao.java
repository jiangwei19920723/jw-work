package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.bean.Pager;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����4:43:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseDao<T> {
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
	 * ͨ��idɾ��ʵ��
	 * @param entity
	 * @return
	 */
	public int delete(String id);
	/**
	 * ͨ��ID����ʵ��
	 * @param id
	 * @return
	 */
	public T findById(String id);
	/**
	 * ��������ʵ��
	 * @return
	 */
	public List<T> findAll();
	/**
	 * ��ҳ��ѯ
	 * @param p
	 * @return
	 */
	public List<T> find(Pager p);
}
