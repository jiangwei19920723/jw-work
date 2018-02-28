package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.OrgleaderDao;
import cn.jcloud.sso.dao.impl.OrgleaderDaoImpl;
import cn.jcloud.sso.entity.Orgleader;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:21:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgleaderDaoTest {
	private OrgleaderDao dao = new OrgleaderDaoImpl();
	@Test
	public void testSave(){
		Orgleader orgleader = new Orgleader();
		orgleader.setOrgId("123");
		orgleader.setUserId("12312");
		orgleader.setLeaderType(2);
		dao.save(orgleader);
	}
	@Test
	public void testUpdate(){
		Orgleader orgleader = new Orgleader();
		orgleader.setOrgId("123");
		orgleader.setUserId("12312");
		orgleader.setLeaderType(3);
		dao.update(orgleader);
	}
	@Test
	public void testFind(){
		Orgleader orgleader = new Orgleader();
		orgleader.setOrgId("123");
		dao.find(orgleader);
		orgleader.setUserId("12312");
		dao.find(orgleader);
		orgleader.setLeaderType(2);
	}
	@Test
	public void testDelete(){
		Orgleader orgleader = new Orgleader();
		orgleader.setOrgId("123");
		orgleader.setUserId("12312");
		orgleader.setLeaderType(2);
		dao.delete(orgleader);
	}
}
