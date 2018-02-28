package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.GroupRoleDao;
import cn.jcloud.sso.entity.GroupRole;
import cn.jcloud.sso.service.GroupRoleService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:11:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupRoleServiceImpl implements GroupRoleService {
	private GroupRoleDao dao =DaoFactory.createGroupRoleDao();
	@Override
	public int save(GroupRole groupRole) {
		return dao.save(groupRole);
	}

	@Override
	public int delete(GroupRole groupRole) {
		return dao.delete(groupRole);
	}

	@Override
	public List<GroupRole> get(GroupRole groupRole) {
		return dao.find(groupRole);
	}

}
