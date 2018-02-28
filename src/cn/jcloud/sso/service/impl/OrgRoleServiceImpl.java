package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.OrgRoleDao;
import cn.jcloud.sso.entity.OrgRole;
import cn.jcloud.sso.service.OrgRoleService;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����10:32:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgRoleServiceImpl implements OrgRoleService {
	private OrgRoleDao dao = DaoFactory.createOrgRoleDao();
	@Override
	public int save(OrgRole orgRole) {
		return dao.save(orgRole);
	}

	@Override
	public int delete(OrgRole orgRole) {
		return dao.delete(orgRole);
	}

	@Override
	public List<OrgRole> get(OrgRole orgRole) {
		return dao.find(orgRole);
	}

}
