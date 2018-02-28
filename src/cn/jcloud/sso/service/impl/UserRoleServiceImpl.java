package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.UserRoleDao;
import cn.jcloud.sso.entity.UserRole;
import cn.jcloud.sso.service.UserRoleService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����10:57:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserRoleServiceImpl implements UserRoleService {
	private UserRoleDao dao = DaoFactory.createUserRoleDao();
	@Override
	public int save(UserRole userRole) {
		return dao.save(userRole);
	}

	@Override
	public int delete(UserRole userRole) {
		return dao.delete(userRole);
	}

	@Override
	public List<UserRole> get(UserRole userRole) {
		return dao.find(userRole);
	}

	@Override
	public int update(UserRole userRole) {
		return dao.update(userRole);
	}

}
