package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.AdminGroupDao;
import cn.jcloud.sso.dao.impl.AdminGroupDaoImpl;
import cn.jcloud.sso.entity.AdminGroup;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午2:51:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminGroupDaoTest {
	private AdminGroupDao dao = new AdminGroupDaoImpl();
	@Test
	public void testSave(){
		AdminGroup adminGroup = new AdminGroup();
		adminGroup.setAdminId("123123");
		adminGroup.setGroupId("123123123");
		dao.save(adminGroup);
	}
	@Test
	public void testFind(){
		AdminGroup adminGroup = new AdminGroup();
		adminGroup.setAdminId("123123");
		dao.find(adminGroup);
		adminGroup.setGroupId("123123123");
		dao.find(adminGroup);
	}
	@Test
	public void testDelete(){
		AdminGroup adminGroup = new AdminGroup();
		adminGroup.setAdminId("123123");
		adminGroup.setGroupId("123123123");
		dao.delete(adminGroup);
	}
}
