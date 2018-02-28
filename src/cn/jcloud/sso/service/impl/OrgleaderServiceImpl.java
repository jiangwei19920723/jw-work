package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.dao.OrgleaderDao;
import cn.jcloud.sso.entity.Orgleader;
import cn.jcloud.sso.service.OrgleaderService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:22:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgleaderServiceImpl implements OrgleaderService {
	private OrgleaderDao dao = DaoFactory.createOrgleaderDao();

	@Override
	public int save(Orgleader orgleader) {
		return dao.save(orgleader);
	}

	@Override
	public int delete(Orgleader orgleader) {
		return dao.delete(orgleader);
	}

	@Override
	public List<Orgleader> get(Orgleader orgleader) {
		return dao.find(orgleader);
	}

	@Override
	public int update(Orgleader orgleader) {
		return dao.update(orgleader);
	}
	
}
