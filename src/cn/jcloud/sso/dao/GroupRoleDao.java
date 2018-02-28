package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.GroupRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午10:41:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface GroupRoleDao extends ReBaseDao<GroupRole> {
	/**
	 * 空实现
	 */
	@Override
	default int update(GroupRole entity) {
		return 0;
	}
}
