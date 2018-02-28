package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.SoftwareDaoImpl;
import cn.jcloud.sso.entity.Software;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午4:00:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SoftwareDaoTest {
	private SoftwareDao dao = new SoftwareDaoImpl();
	@Test
	public void testSave(){
		Software software = new Software();
		software.setSoftwareId("123");
		software.setChanger("123123");
		software.setSoftwareCallbackIp("123123");
		software.setSoftwareKey("key");
		software.setSoftwareLoadIp("loadip");
		software.setSoftwareName("name");
		software.setTime(new Date());
		dao.save(software);
	}
	@Test
	public void testUpdate(){
		Software software = new Software();
		software.setSoftwareId("123");
		software.setChanger("123123");
		software.setSoftwareCallbackIp("123123");
		software.setSoftwareKey("key1");
		software.setSoftwareLoadIp("loadip");
		software.setSoftwareName("name1");
		software.setTime(new Date());
		dao.update(software);
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
