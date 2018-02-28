package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.AdminRoleDao;
import cn.jcloud.sso.dao.impl.AdminRoleDaoImpl;
import cn.jcloud.sso.entity.AdminRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午2:59:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminRoleDaoTest {
	private AdminRoleDao dao = new AdminRoleDaoImpl();
	@Test
	public void testSave(){
		AdminRole adminRole = new AdminRole();
		adminRole.setAdminId("123123");
		adminRole.setRoleId("123123");
		dao.save(adminRole);
	}
	@Test
	public void testFind(){
		AdminRole adminRole = new AdminRole();
		adminRole.setAdminId("123123");
		dao.find(adminRole);
		adminRole.setRoleId("123123");
		dao.find(adminRole);
	}
	@Test
	public void testDelete(){
		AdminRole adminRole = new AdminRole();
		adminRole.setAdminId("123123");
		adminRole.setRoleId("123123");
		dao.delete(adminRole);
	}
}
