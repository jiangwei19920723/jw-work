package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.UserGroupDao;
import cn.jcloud.sso.entity.UserGroup;
import cn.jcloud.sso.service.UserGroupService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����10:55:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserGroupServiceImpl implements UserGroupService {
	private UserGroupDao dao = DaoFactory.createUserGroupDao();
	@Override
	public int save(UserGroup userGroup) {
		return dao.save(userGroup);
	}

	@Override
	public int delete(UserGroup userGroup) {
		return dao.delete(userGroup);
	}

	@Override
	public List<UserGroup> get(UserGroup userGroup) {
		return dao.find(userGroup);
	}

	@Override
	public int update(UserGroup userGroup) {
		return dao.update(userGroup);
	}

}
