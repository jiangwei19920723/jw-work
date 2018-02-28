package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.dao.GroupRoleDao;
import cn.jcloud.sso.dao.impl.GroupRoleDaoImpl;
import cn.jcloud.sso.entity.GroupRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:18:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupRoleDaoTest {
	private GroupRoleDao dao = new GroupRoleDaoImpl();
	@Test
	public void testSave(){
		GroupRole groupRole = new GroupRole();
		groupRole.setGroupId("123123");
		groupRole.setRoleId("123123");
		dao.save(groupRole);
	}
	@Test
	public void testFind(){
		GroupRole groupRole = new GroupRole();
		groupRole.setGroupId("123123");
		dao.find(groupRole);
		groupRole.setRoleId("123123");
		dao.find(groupRole);
	}
	@Test
	public void testDelete(){
		GroupRole groupRole = new GroupRole();
		groupRole.setGroupId("123123");
		groupRole.setRoleId("123123");
		dao.delete(groupRole);
	}
}
