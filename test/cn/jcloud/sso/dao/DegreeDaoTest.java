package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.DegreeDao;
import cn.jcloud.sso.dao.impl.DegreeDaoImpl;
import cn.jcloud.sso.entity.Degree;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:02:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class DegreeDaoTest {
	private DegreeDao dao = new DegreeDaoImpl();
	@Test
	public void testSave(){
		Degree degree = new Degree();
		degree.setDegree(123);
		degree.setDegreeName("zhangsan");
		dao.save(degree);
	}
	@Test
	public void testUpdate(){
		Degree degree = new Degree();
		degree.setDegree(123);
		degree.setDegreeName("lisi");
		dao.update(degree);
	}
	@Test
	public void testFind(){
		dao.fingByid(123);
		dao.findAll();
		Pager pager = new Pager();
		pager.setPage(1);
		pager.setPageSize(4);
		dao.find(pager);
	}
	@Test
	public void testDelete(){
		dao.delete(123);
	}
}
