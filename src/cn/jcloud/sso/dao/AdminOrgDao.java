package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminOrg;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午10:56:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminOrgDao extends ReBaseDao<AdminOrg> {
	/**
	 * 空实现
	 */
	@Override
	default int update(AdminOrg entity) {
		return 0;
	}
}
