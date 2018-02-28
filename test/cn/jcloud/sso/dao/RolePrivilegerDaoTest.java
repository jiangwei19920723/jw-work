package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.impl.RolePrivilegeDaoImpl;
import cn.jcloud.sso.entity.RolePrivilege;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:52:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RolePrivilegerDaoTest {
	private RolePrivilegeDao dao = new RolePrivilegeDaoImpl();
	@Test
	public void testSave(){
		RolePrivilege privilege = new RolePrivilege();
		privilege.setRoleId("123");
		privilege.setType(2);
		privilege.setrId("123");
		privilege.setpId("123");
		privilege.setDoMain("123123");
		dao.save(privilege);
	}
	@Test
	public void testUpdate(){
		RolePrivilege privilege = new RolePrivilege();
		privilege.setRoleId("123");
		privilege.setType(2);
		privilege.setrId("123");
		privilege.setpId("123");
		privilege.setDoMain("123");
		dao.update(privilege);
	}
	@Test
	public void testFind(){
		RolePrivilege privilege = new RolePrivilege();
		privilege.setRoleId("123");
		dao.find(privilege);
		privilege.setType(2);
		privilege.setrId("123");
		dao.find(privilege);
		privilege.setpId("123");
		dao.find(privilege);
		privilege.setDoMain("123");
	}
	@Test
	public void testDelete(){
		RolePrivilege privilege = new RolePrivilege();
		privilege.setRoleId("123");
		privilege.setType(2);
		privilege.setrId("123");
		privilege.setpId("123");
		privilege.setDoMain("123");
		dao.delete(privilege);
	}
}
