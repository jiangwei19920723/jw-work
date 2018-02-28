package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.dao.impl.UserGroupDaoImpl;
import cn.jcloud.sso.entity.UserGroup;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月27日 下午4:44:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserGroupDaoTest {
	private UserGroupDao dao = new UserGroupDaoImpl();
	@Test
	public void testSave(){
		UserGroup userGroup = new UserGroup();
		userGroup.setUserId("123");
		userGroup.setGroupId("123");
		userGroup.setExpiredDate(new Date());
		dao.save(userGroup);
	}
	@Test
	public void testUpdate(){
		UserGroup userGroup = new UserGroup();
		userGroup.setUserId("123");
		userGroup.setGroupId("1");
		userGroup.setExpiredDate(new Date());
		dao.update(userGroup);
	}
	@Test
	public void testFind(){
		UserGroup userGroup = new UserGroup();
		userGroup.setUserId("123");
		dao.find(userGroup);
		userGroup.setGroupId("1");
		dao.find(userGroup);
	}
	@Test
	public void testDelete(){
		UserGroup userGroup = new UserGroup();
		userGroup.setUserId("123");
		userGroup.setGroupId("1");
		dao.delete(userGroup);
	}
}
