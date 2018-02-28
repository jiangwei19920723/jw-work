package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.UserTypeDaoImpl;
import cn.jcloud.sso.entity.UserType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月27日 下午5:00:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserTypeDaoTest {
	private UserTypeDao dao = new UserTypeDaoImpl();
	@Test
	public void testSave(){
		UserType userType = new UserType();
		userType.setUserType("123");
		userType.setUserTypeName("zhangsan");
		dao.save(userType);
	}
	@Test
	public void testUpdate(){
		UserType userType = new UserType();
		userType.setUserType("123");
		userType.setUserTypeName("lisi");
		dao.update(userType);
	}
	@Test
	public void testFind(){
		dao.findById("123");
		dao.findAll();
		dao.find(new Pager(1,3));
	}
	@Test
	public void testDelete(){
		dao.delete("123");
	}
}
