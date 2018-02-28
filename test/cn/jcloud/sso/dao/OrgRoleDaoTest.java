package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.OrgRoleDao;
import cn.jcloud.sso.dao.impl.OrgRoleDaoImpl;
import cn.jcloud.sso.entity.OrgRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:28:13 
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
