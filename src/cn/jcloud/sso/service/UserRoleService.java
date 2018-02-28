package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.UserRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:48:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserRoleService extends ReBaseService<UserRole> {
	public int update(UserRole userRole);
}
