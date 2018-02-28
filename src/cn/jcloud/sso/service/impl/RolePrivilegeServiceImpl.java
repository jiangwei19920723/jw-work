package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.RolePrivilegeDao;
import cn.jcloud.sso.entity.RolePrivilege;
import cn.jcloud.sso.service.RolePrivilegeService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:43:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RolePrivilegeServiceImpl implements RolePrivilegeService {
	private RolePrivilegeDao dao = DaoFactory.createRolePrivilegeDao();
	@Override
	public int save(RolePrivilege rolePrivilege) {
		return dao.save(rolePrivilege);
	}

	@Override
	public int delete(RolePrivilege rolePrivilege) {
		return dao.delete(rolePrivilege);
	}

	@Override
	public List<RolePrivilege> get(RolePrivilege rolePrivilege) {
		return dao.find(rolePrivilege);
	}

	@Override
	public int update(RolePrivilege rolePrivilege) {
		return dao.update(rolePrivilege);
	}

}
