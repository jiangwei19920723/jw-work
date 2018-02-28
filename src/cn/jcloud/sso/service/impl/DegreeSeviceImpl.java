package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.DegreeDao;
import cn.jcloud.sso.entity.Degree;
import cn.jcloud.sso.service.DegreeService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:59:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DegreeSeviceImpl implements DegreeService {
	private DegreeDao dao = DaoFactory.createDegreeDao();
	@Override
	public int save(Degree degree) {
		degree.setDegree(GeneratorToId.getIntId());
		return dao.save(degree);
	}

	@Override
	public int update(Degree degree) {
		return dao.update(degree);
	}

	@Override
	public int delete(Degree degree) {
		return dao.delete(degree);
	}

	@Override
	public int deleteById(int id) {
		return dao.delete(id);
	}

	@Override
	public Degree getById(int id) {
		return dao.fingByid(id);
	}

	@Override
	public List<Degree> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Degree> getPager(Pager p) {
		return dao.find(p);
	}

}
