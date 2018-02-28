package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.Post;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:46:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PostService extends BaseService<Post> {
	public int deleteById(int id);
	public Post getById(int id);
	/**
	 * 未实现
	 */
	@Override
	default Post getById(String id) {
		return null;
	}
	/**
	 * 未实现
	 */
	@Override
	default int deleteById(String id) {
		return 0;
	}
}
