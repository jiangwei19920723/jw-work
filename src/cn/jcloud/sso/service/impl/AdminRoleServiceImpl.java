package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.AdminRoleDao;
import cn.jcloud.sso.entity.AdminRole;
import cn.jcloud.sso.service.AdminRoleService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:55:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminRoleServiceImpl implements AdminRoleService {
	private AdminRoleDao dao = DaoFactory.createAdminRoleDao();
	@Override
	public int save(AdminRole adminRole) {
		return dao.save(adminRole);
	}

	@Override
	public int delete(AdminRole adminRole) {
		return dao.delete(adminRole);
	}

	@Override
	public List<AdminRole> get(AdminRole adminRole) {
		return dao.find(adminRole);
	}

}
