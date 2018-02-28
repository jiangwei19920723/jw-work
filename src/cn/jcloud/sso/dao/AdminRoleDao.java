package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午11:05:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminRoleDao extends ReBaseDao<AdminRole> {
	/**
	 * 空实现
	 */
	@Override
	default int update(AdminRole entity) {
		return 0;
	}
}
