package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.User;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����3:11:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserDao extends BaseDao<User> {
	public User fingByUserName(String userName);
}
