package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.UserSoftwareDao;
import cn.jcloud.sso.entity.UserSoftware;
import cn.jcloud.sso.service.UserSoftwareService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月30日 下午2:56:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserSoftwareServiceImpl implements UserSoftwareService {
	private UserSoftwareDao dao = DaoFactory.createUserSoftwareDao();
	@Override
	public int save(UserSoftware userSoftware) {
		return dao.save(userSoftware);
	}

	@Override
	public int delete(UserSoftware userSoftware) {
		return dao.delete(userSoftware);
	}

	@Override
	public List<UserSoftware> get(UserSoftware userSoftware) {
		return dao.find(userSoftware);
	}

}
