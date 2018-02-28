package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午10:20:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgTypeDao extends ReBaseDao<OrgType> {
	public OrgType find(String orgtype);
	/**
	 * 空实现
	 */
	@Override
	default List<OrgType> find(OrgType entity) {
		return null;
	}
}
