package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.AdminGroupDao;
import cn.jcloud.sso.entity.AdminGroup;
import cn.jcloud.sso.service.AdminGroupService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:51:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminGroupServiceImpl implements AdminGroupService {
	private AdminGroupDao dao = DaoFactory.createAdminGroupDao();
	@Override
	public int save(AdminGroup adminGroup) {
		return dao.save(adminGroup);
	}

	@Override
	public int delete(AdminGroup adminGroup) {
		return dao.delete(adminGroup);
	}

	@Override
	public List<AdminGroup> get(AdminGroup adminGroup) {
		return dao.find(adminGroup);
	}

}
