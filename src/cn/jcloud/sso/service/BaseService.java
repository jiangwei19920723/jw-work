package cn.jcloud.sso.service;

import java.util.List;

import cn.jcloud.sso.bean.Pager;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��28�� ����1:51:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseService<T> {
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
	 * @param id
	 * @return
	 */
	public int deleteById(String id);
	/**
	 * ͨ��id����ʵ��
	 * @param id
	 * @return
	 */
	public T getById(String id);
	/**
	 * ��������ʵ��
	 * @return
	 */
	public List<T> getAll();
	/**
	 * ��ҳ��ѯ
	 * @param p
	 * @return
	 */
	public List<T> getPager(Pager p);
}
