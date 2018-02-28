package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.OrgRoleDao;
import cn.jcloud.sso.dao.impl.OrgRoleDaoImpl;
import cn.jcloud.sso.entity.OrgRole;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����3:28:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgRoleDaoTest {
	private OrgRoleDao dao = new OrgRoleDaoImpl();
	@Test
	public void testSave(){
		OrgRole orgRole = new OrgRole();
		orgRole.setOrgId("123");
		orgRole.setRoleId("123123");
		dao.save(orgRole);
	}
	@Test
	public void testFind(){
		OrgRole orgRole = new OrgRole();
		orgRole.setOrgId("123");
		dao.find(orgRole);
		orgRole.setRoleId("123123");
		dao.find(orgRole);
	}
	@Test
	public void testDelete(){
		OrgRole orgRole = new OrgRole();
		orgRole.setOrgId("123");
		orgRole.setRoleId("123123");
		dao.delete(orgRole);
	}
}
