package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.AdminDao;
import cn.jcloud.sso.dao.impl.AdminDaoImpl;
import cn.jcloud.sso.entity.Admin;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����2:29:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminDaoTest {
	private AdminDao dao = new AdminDaoImpl();
	@Test
	public void testSave(){
		Admin admin = new Admin();
		admin.setAdminId("123123");
		admin.setAdminName("����Ա");
		admin.setAuthenabled(1);
		admin.setCreateTime(new Date());
		admin.setCreator("����");
		admin.setModifier("����");
		admin.setModifyTime(new Date());
		admin.setRemark("123123");
		dao.save(admin);
	}
	@Test
	public void testUpdate(){
		Admin admin = new Admin();
		admin.setAdminId("123123");
		admin.setAdminName("����Ա");
		admin.setAuthenabled(1);
		admin.setCreateTime(new Date());
		admin.setCreator("����");
		admin.setModifier("����");
		admin.setModifyTime(new Date());
		admin.setRemark("123");
		dao.update(admin);
	}
	@Test
	public void testFind(){
		Admin admin = dao.findById("123123");
		dao.findAll();
		Pager pager = new Pager();
		pager.setPage(1);
		pager.setPageSize(4);
		dao.find(pager);
		System.out.println(admin);
	}
	@Test
	public void testDelete(){
		dao.delete("123123");
	}
}
