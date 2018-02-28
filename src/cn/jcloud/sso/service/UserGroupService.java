package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.UserGroup;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:47:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserGroupService extends ReBaseService<UserGroup> {
	public int update(UserGroup userGroup);
}
