package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.UserDao;
import cn.jcloud.sso.entity.User;
import cn.jcloud.sso.service.UserService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月28日 下午2:11:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserServiceImpl implements UserService {
	
	private UserDao dao = DaoFactory.createUserDao();
	
	@Override
	public int save(User user) {
		user.setUserId(GeneratorToId.getStringId());
		return dao.save(user);
	}

	@Override
	public int update(User user) {
		return dao.update(user);
	}

	@Override
	public int delete(User user) {
		return dao.delete(user);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public User getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<User> getAll() {
		return dao.findAll();
	}

	@Override
	public List<User> getPager(Pager p) {
		return dao.find(p);
	}

	@Override
	public User getByUserName(String userName) {
		return dao.fingByUserName(userName);
	}

}
