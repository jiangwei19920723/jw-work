package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.User;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月28日 下午2:08:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserService extends BaseService<User> {
	/**
	 * 通过userName查询User
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);
}
