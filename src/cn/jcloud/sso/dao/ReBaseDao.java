package cn.jcloud.sso.dao;

import java.util.List;
import java.util.Map;

import cn.jcloud.sso.common.RowConverter;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:55:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface ReBaseDao<T> extends RowConverter<T> {
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
	 * 查询实体
	 * @param entity
	 * @return
	 */
	public List<T> find(T entity);
	
}
