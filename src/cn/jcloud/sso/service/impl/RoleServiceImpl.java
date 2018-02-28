package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.RoleDao;
import cn.jcloud.sso.entity.Role;
import cn.jcloud.sso.service.RoleService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月28日 下午4:44:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RoleServiceImpl implements RoleService {
	private RoleDao dao = DaoFactory.createRoleDao();
	@Override
	public int save(Role role) {
		role.setRoleId(GeneratorToId.getStringId());
		return dao.save(role);
	}

	@Override
	public int update(Role role) {
		return dao.update(role);
	}

	@Override
	public int delete(Role role) {
		return dao.delete(role);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public Role getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<Role> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Role> getPager(Pager p) {
		return dao.find(p);
	}

	@Override
	public List<Role> getByParentId(String parentId) {
		return dao.findByParentId(parentId);
	}

}
