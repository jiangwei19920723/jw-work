package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.User;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��28�� ����2:08:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserService extends BaseService<User> {
	/**
	 * ͨ��userName��ѯUser
	 * @param userName
	 * @return
	 */
	public User getByUserName(String userName);
}
