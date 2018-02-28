package cn.jcloud.sso.service.impl;

import java.util.List;

import cn.jcloud.sso.bean.Pager;
import cn.jcloud.sso.common.DaoFactory;
import cn.jcloud.sso.common.GeneratorToId;
import cn.jcloud.sso.dao.PostDao;
import cn.jcloud.sso.entity.Post;
import cn.jcloud.sso.service.PostService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午10:39:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PostServiceImpl implements PostService {
	private PostDao dao = DaoFactory.createPostDao();
	@Override
	public int save(Post post) {
		post.setPostId(GeneratorToId.getIntId());
		return dao.save(post);
	}

	@Override
	public int update(Post post) {
		return dao.update(post);
	}

	@Override
	public int delete(Post post) {
		return dao.delete(post);
	}

	@Override
	public int deleteById(int id) {
		return dao.delete(id);
	}

	@Override
	public Post getById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Post> getAll() {
		return dao.findAll();
	}

	@Override
	public List<Post> getPager(Pager p) {
		return dao.find(p);
	}

}
