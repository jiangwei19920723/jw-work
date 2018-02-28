package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminGroup;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午11:17:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminGroupDao extends ReBaseDao<AdminGroup> {
	/**
	 * 空实现
	 */
	@Override
	default int update(AdminGroup entity) {
		return 0;
	}
}
