package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.impl.OrgTypeDaoImpl;
import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:31:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgTypeDaoTest {
	private OrgTypeDao dao = new OrgTypeDaoImpl();
	@Test
	public void testSave(){
		OrgType orgType = new OrgType();
		orgType.setOrgType("123");
		orgType.setOrgTypeName("zhangsan");
		dao.save(orgType);
	}
	@Test
	public void testUpdate(){
		OrgType orgType = new OrgType();
		orgType.setOrgType("123");
		orgType.setOrgTypeName("lisi");
		dao.update(orgType);
	}
	@Test
	public void testFind(){
		dao.find("123");
	}
	@Test
	public void testDelete(){
		OrgType orgType = new OrgType();
		orgType.setOrgType("123");
		orgType.setOrgTypeName("lisi");
		dao.delete(orgType);
	}
}
