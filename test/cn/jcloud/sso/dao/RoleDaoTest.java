package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.RoleDaoImpl;
import cn.jcloud.sso.entity.Role;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:41:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RoleDaoTest {
	private RoleDao dao = new RoleDaoImpl();
	@Test
	public void testSave(){
		Role role = new Role();
		role.setCreateTime(new Date());
		role.setCreator("123");
		role.setEnabled(123);
		role.setModifier("123123");
		role.setModifyTime(new Date());
		role.setO(2);
		role.setParentId("123123");
		role.setRemark("123123");
		role.setRoleId("321");
		role.setRoleLevel(123);
		role.setRoleName("asd");
		role.setVersion(1);
		dao.save(role);
	}
	@Test
	public void testUpdate(){
		Role role = new Role();
		role.setCreateTime(new Date());
		role.setCreator("123");
		role.setEnabled(123);
		role.setModifier("123123");
		role.setModifyTime(new Date());
		role.setO(2);
		role.setParentId("123123");
		role.setRemark("123123");
		role.setRoleId("321");
		role.setRoleLevel(123);
		role.setRoleName("fswe");
		role.setVersion(1);
		dao.update(role);
	}
	@Test
	public void testFind(){
		dao.findById("321");
		dao.findAll();
		dao.find(new Pager(1,3));
		dao.findByParentId("123");
	}
	@Test
	public void testDelete(){
		dao.delete("321");
	}
}
