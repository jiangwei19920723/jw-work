package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.UserStampDaoImpl;
import cn.jcloud.sso.entity.UserStamp;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月27日 下午4:56:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserStampDaoTest {
	private UserStampDao dao = new UserStampDaoImpl();
	@Test
	public void testSave(){
		UserStamp userStamp = new UserStamp();
		userStamp.setPath("123");
		userStamp.setUserId("123");
		userStamp.setO(2);
		dao.save(userStamp);
	}
	@Test
	public void testUpdate(){
		UserStamp userStamp = new UserStamp();
		userStamp.setPath("123");
		userStamp.setUserId("1");
		userStamp.setO(2);
		dao.update(userStamp);
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
