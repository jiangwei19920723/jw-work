package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.AdminOrgDao;
import cn.jcloud.sso.entity.AdminOrg;
import cn.jcloud.sso.service.AdminOrgService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:54:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminOrgServiceImpl implements AdminOrgService {
	private AdminOrgDao dao = DaoFactory.createAdminOrgDao();
	@Override
	public int save(AdminOrg adminOrg) {
		return dao.save(adminOrg);
	}

	@Override
	public int delete(AdminOrg adminOrg) {
		return dao.delete(adminOrg);
	}

	@Override
	public List<AdminOrg> get(AdminOrg adminOrg) {
		return dao.find(adminOrg);
	}

}
