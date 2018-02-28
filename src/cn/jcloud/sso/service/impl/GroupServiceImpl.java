package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.GroupDao;
import cn.jcloud.sso.entity.Group;
import cn.jcloud.sso.service.GroupService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:13:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupServiceImpl implements GroupService {
	private GroupDao dao = DaoFactory.createGroupDao();
	@Override
	public int save(Group group) {
		group.setGroupId(GeneratorToId.getStringId());
		return dao.save(group);
	}

	@Override
	public int update(Group group) {
		return dao.update(group);
	}

	@Override
	public int delete(Group group) {
		return dao.delete(group);
	}

	@Override
	public int deleteById(String id) {
		return dao.delete(id);
	}

	@Override
	public Group getById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<Group> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Group> getPager(Pager p) {
		return dao.find(p);
	}

}
