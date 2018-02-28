package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.AdminDao;
import cn.jcloud.sso.entity.Admin;
import cn.jcloud.sso.service.AdminService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:57:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminServiceImpl implements AdminService {
	private AdminDao dao = DaoFactory.createAdminDao();
	@Override
	public int save(Admin admin) {
		admin.setAdminId(GeneratorToId.getStringId());
		return dao.save(admin);
	}

	@Override
	public int update(Admin admin) {
		return dao.update(admin);
	}

	@Override
	public int delete(Admin admin) {
		return dao.delete(admin);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public Admin getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<Admin> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Admin> getPager(Pager p) {
		return dao.find(p);
	}

}
