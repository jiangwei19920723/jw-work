package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.UserTypeDao;
import cn.jcloud.sso.entity.UserType;
import cn.jcloud.sso.service.UserTypeService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午11:04:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserTypeServiceImpl implements UserTypeService {
	private UserTypeDao dao = DaoFactory.createUserTypeDao();
	@Override
	public int save(UserType userType) {
		userType.setUserType(GeneratorToId.getStringId());
		return dao.save(userType);
	}

	@Override
	public int update(UserType userType) {
		return dao.update(userType);
	}

	@Override
	public int delete(UserType userType) {
		return dao.delete(userType);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public UserType getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<UserType> getAll() {
		return dao.findAll();
	}

	@Override
	public List<UserType> getPager(Pager p) {
		return dao.find(p);
	}

}
