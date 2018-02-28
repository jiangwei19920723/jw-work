package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.UserRoleDao;
import cn.jcloud.sso.entity.UserRole;
import cn.jcloud.sso.service.UserRoleService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:57:27 
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
