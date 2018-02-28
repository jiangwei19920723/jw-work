package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.UserDaoImpl;
import cn.jcloud.sso.entity.User;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午4:05:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserDaoTest {
	private UserDao dao = new UserDaoImpl();
	@Test
	public void testSave(){
		User user = new User();
		user.setUserId("123");
		user.setLoginName("123");
		user.setUserName("123");
		user.setUserLevel(1);
		user.setPassword("123123");
		user.setExpiredDate(new Date());
		user.setExpired(1);
		user.setAdminId("123");
		user.setOrgId("123");
		user.setIsLeader(1);
		user.setSkin("123");
		user.setLangCode("123");
		user.setIpConfig("123");
		user.setUserType("123");
		user.setPostId(1);
		user.setSex(1);
		user.setBirthday(new Date());
		user.setIdCard("123123");
		user.setPhotoFile(3);
		user.setSchool("123");
		user.setGraduation(2);
		user.setDegree(1);
		user.setMajor("123");
		user.setCountry("123");
		user.setProvince("123");
		user.setCity("123");
		user.setAddress("123");
		user.setPostcode("123");
		user.setPhone("123");
		user.setFax("123");
		user.setMobile("123");
		user.setEmail("123");
		user.setRemark("123");
		user.setCreator("123");
		user.setCreateTime(new Date());
		user.setModifier("123");
		user.setModifyTime(new Date());
		user.setO(1);
		
		dao.save(user);
	}
	@Test
	public void testUpdate(){
		User user = new User();
		user.setUserId("123");
		user.setLoginName("123");
		user.setUserName("123");
		user.setUserLevel(1);
		user.setPassword("123123");
		user.setExpiredDate(new Date());
		user.setExpired(1);
		user.setAdminId("123");
		user.setOrgId("123");
		user.setIsLeader(1);
		user.setSkin("123");
		user.setLangCode("123");
		user.setIpConfig("123");
		user.setUserType("123");
		user.setPostId(1);
		user.setSex(1);
		user.setBirthday(new Date());
		user.setIdCard("123123");
		user.setPhotoFile(3);
		user.setSchool("123");
		user.setGraduation(2);
		user.setDegree(1);
		user.setMajor("123");
		user.setCountry("123");
		user.setProvince("123");
		user.setCity("123");
		user.setAddress("123");
		user.setPostcode("123");
		user.setPhone("123");
		user.setFax("123");
		user.setMobile("123");
		user.setEmail("123");
		user.setRemark("123");
		user.setCreator("123");
		user.setCreateTime(new Date());
		user.setModifier("123");
		user.setModifyTime(new Date());
		user.setO(2);
		dao.update(user);
	}
	@Test
	public void testFind(){
		dao.findById("123");
		dao.fingByUserName("123");
		dao.findAll();
		dao.find(new  Pager(1, 3));
	}
	@Test
	public void testDelete(){
		dao.delete("123");
	}
}
