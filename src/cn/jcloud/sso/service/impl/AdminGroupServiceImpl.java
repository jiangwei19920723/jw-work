package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.AdminGroupDao;
import cn.jcloud.sso.entity.AdminGroup;
import cn.jcloud.sso.service.AdminGroupService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:51:39 
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
