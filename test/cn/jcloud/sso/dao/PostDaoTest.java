package cn.jcloud.sso.dao;

import org.junit.Test;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.dao.impl.PostDaoImpl;
import cn.jcloud.sso.entity.Post;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午3:37:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PostDaoTest {
	private PostDao dao = new PostDaoImpl();
	@Test
	public void testSave(){
		Post post = new Post();
		post.setPostId(123);
		post.setPostName("123123");
		dao.save(post);
	}
	@Test
	public void testUpdate(){
		Post post = new Post();
		post.setPostId(123);
		post.setPostName("12312");
		dao.update(post);
	}
	@Test
	public void testFind(){
		dao.findById(123);
		dao.findAll();
		dao.find(new Pager(1,3));
	}
	@Test
	public void testDelete(){
		Post post = new Post();
		post.setPostId(123);
		post.setPostName("12312");
		dao.delete(post);
	}
}
