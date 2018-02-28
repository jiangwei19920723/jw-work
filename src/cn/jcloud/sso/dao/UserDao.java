package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.User;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午3:11:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserDao extends BaseDao<User> {
	public User fingByUserName(String userName);
}
