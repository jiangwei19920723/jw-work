package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.AdminOrgDao;
import cn.jcloud.sso.dao.impl.AdminOrgDaoImpl;
import cn.jcloud.sso.entity.AdminOrg;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午2:55:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminOrgDaoTest {
	private AdminOrgDao dao = new AdminOrgDaoImpl();
	@Test
	public void testSave(){
		AdminOrg adminOrg = new AdminOrg();
		adminOrg.setAdminId("123123");
		adminOrg.setOrgId("123123123");
		dao.save(adminOrg);
	}
	@Test
	public void testFind(){
		AdminOrg adminOrg = new AdminOrg();
		adminOrg.setAdminId("123123");
		dao.find(adminOrg);
		adminOrg.setOrgId("123123123");
		dao.find(adminOrg);
	}
	@Test
	public void testDelete(){
		AdminOrg adminOrg = new AdminOrg();
		adminOrg.setAdminId("123123");
		adminOrg.setOrgId("123123123");
		dao.delete(adminOrg);
	}
}
