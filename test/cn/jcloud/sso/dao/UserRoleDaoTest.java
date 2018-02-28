package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.dao.impl.UserRoleDaoImpl;
import cn.jcloud.sso.entity.UserRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月27日 下午4:51:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserRoleDaoTest {
	private UserRoleDao dao = new UserRoleDaoImpl();
	@Test
	public void testSave(){
		UserRole userRole = new UserRole();
		userRole.setUserId("123");
		userRole.setRoleId("123");
		userRole.setHold(2);
		userRole.setExpiredDate(new Date());
		dao.save(userRole);
	}
	@Test
	public void testUpdate(){
		UserRole userRole = new UserRole();
		userRole.setUserId("123");
		userRole.setRoleId("1");
		userRole.setHold(2);
		userRole.setExpiredDate(new Date());
		dao.update(userRole);
	}
	@Test
	public void testFind(){
		UserRole userRole = new UserRole();
		userRole.setUserId("123");
		dao.find(userRole);
		userRole.setRoleId("123");
		dao.find(userRole);
	}
	@Test
	public void testDelete(){
		UserRole userRole = new UserRole();
		userRole.setUserId("123");
		userRole.setRoleId("1");
		dao.delete(userRole);
	}
}
