package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.bean.Pager;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午4:43:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseDao<T> {
	/**
	 * 保存实体
	 * @param entity
	 * @return
	 */
	public int save(T entity);
	/**
	 * 修改实体
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	/**
	 * 删除实体
	 * @param entity
	 * @return
	 */
	public int delete(T entity);
	/**
	 * 通过id删除实体
	 * @param entity
	 * @return
	 */
	public int delete(String id);
	/**
	 * 通过ID查找实体
	 * @param id
	 * @return
	 */
	public T findById(String id);
	/**
	 * 查找所有实体
	 * @return
	 */
	public List<T> findAll();
	/**
	 * 分页查询
	 * @param p
	 * @return
	 */
	public List<T> find(Pager p);
}
