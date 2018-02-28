package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.Post;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 下午1:40:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PostDao extends BaseDao<Post> {
	/**
	 * 未实现
	 */
	@Override
	default int delete(String id) {
		return 0;
	}
	/**
	 * 未实现
	 */
	@Override
	default Post findById(String id) {
		return null;
	}
	public int delete(int id);
	public Post findById(int id);
}
