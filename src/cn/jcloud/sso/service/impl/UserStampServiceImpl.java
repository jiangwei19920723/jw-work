package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.UserStampDao;
import cn.jcloud.sso.entity.UserStamp;
import cn.jcloud.sso.service.UserStampService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:59:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserStampServiceImpl implements UserStampService {
	private UserStampDao dao = DaoFactory.createUserStampDao();
	@Override
	public int save(UserStamp userStamp) {
		userStamp.setPath(GeneratorToId.getStringId());
		return dao.save(userStamp);
	}

	@Override
	public int update(UserStamp userStamp) {
		return dao.update(userStamp);
	}

	@Override
	public int delete(UserStamp userStamp) {
		return dao.delete(userStamp);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public UserStamp getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<UserStamp> getAll() {
		return dao.findAll();
	}

	@Override
	public List<UserStamp> getPager(Pager p) {
		return dao.find(p);
	}

}
