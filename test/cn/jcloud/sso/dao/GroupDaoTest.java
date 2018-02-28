package cn.jcloud.sso.dao;

import java.util.Date;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.GroupDao;
import cn.jcloud.sso.dao.impl.GroupDaoImpl;
import cn.jcloud.sso.entity.Group;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:08:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupDaoTest {
	private GroupDao dao = new GroupDaoImpl();
	@Test
	public void testSave(){
		Group group = new Group();
		group.setCreateTime(new Date());
		group.setCreator("zhangsan");
		group.setEnabled(123);
		group.setGroupId("123");
		group.setGroupLevel(12);
		group.setGroupName("lisi");
		group.setModifier("das");
		group.setModifyTime(new Date());
		group.setO(2);
		group.setParentId("123");
		group.setRemark("beizhu");
		dao.save(group);
	}
	@Test
	public void testUpdate(){
		Group group = new Group();
		group.setCreateTime(new Date());
		group.setCreator("zhangsan");
		group.setEnabled(123);
		group.setGroupId("123");
		group.setGroupLevel(12);
		group.setGroupName("lisi");
		group.setModifier("das");
		group.setModifyTime(new Date());
		group.setO(2);
		group.setParentId("123");
		group.setRemark("123");
		dao.update(group);
	}
	@Test
	public void testFind(){
		dao.findById("123");
		dao.findAll();
		Pager pager = new Pager(1, 4);
		dao.find(pager);
	}
	@Test
	public void testDelete(){
		dao.delete("123");
	}

}
