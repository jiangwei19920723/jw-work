package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.Post;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:46:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PostService extends BaseService<Post> {
	public int deleteById(int id);
	public Post getById(int id);
	/**
	 * δʵ��
	 */
	@Override
	default Post getById(String id) {
		return null;
	}
	/**
	 * δʵ��
	 */
	@Override
	default int deleteById(String id) {
		return 0;
	}
}
