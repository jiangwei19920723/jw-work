package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.entity.UserSoftware;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��30�� ����2:59:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserSoftwareTest {
	private UserSoftwareDao dao = DaoFactory.createUserSoftwareDao();
	@Test
	public void testSave(){
		UserSoftware userSoftware = new UserSoftware();
		userSoftware.setSoftwareId("123");
		userSoftware.setUserId("123");
		dao.save(userSoftware);
	}
	@Test
	public void testFind(){
		UserSoftware userSoftware = new UserSoftware();
		userSoftware.setSoftwareId("123");
		dao.find(userSoftware);
		userSoftware.setUserId("123");
		dao.find(userSoftware);
	}
	@Test
	public void testDelete(){
		UserSoftware userSoftware = new UserSoftware();
		userSoftware.setSoftwareId("123");
		userSoftware.setUserId("123");
		dao.delete(userSoftware);
	}
}
