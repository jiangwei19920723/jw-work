package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.OrgTypeDao;
import cn.jcloud.sso.entity.OrgType;
import cn.jcloud.sso.service.OrgTypeService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:34:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgTypeServiceImpl implements OrgTypeService {
	private OrgTypeDao dao = DaoFactory.createOrgTypeDao();
	@Override
	public int save(OrgType orgType) {
		return dao.save(orgType);
	}

	@Override
	public int delete(OrgType orgType) {
		return dao.delete(orgType);
	}

	@Override
	public List<OrgType> get(OrgType orgType) {
		return dao.find(orgType);
	}

	@Override
	public int update(OrgType orgType) {
		return dao.update(orgType);
	}

	@Override
	public OrgType getById(String orgType) {
		return dao.find(orgType);
	}

}
