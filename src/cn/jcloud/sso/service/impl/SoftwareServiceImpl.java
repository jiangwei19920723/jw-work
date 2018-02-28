package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.SoftwareDao;
import cn.jcloud.sso.entity.Software;
import cn.jcloud.sso.service.SoftwareService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:53:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SoftwareServiceImpl implements SoftwareService {
	private SoftwareDao dao = DaoFactory.createSoftwareDao();
	@Override
	public int save(Software software) {
		software.setSoftwareId(GeneratorToId.getStringId());
		return dao.save(software);
	}

	@Override
	public int update(Software Software) {
		return dao.update(Software);
	}

	@Override
	public int delete(Software Software) {
		return dao.delete(Software);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public Software getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<Software> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Software> getPager(Pager p) {
		return dao.find(p);
	}

}
