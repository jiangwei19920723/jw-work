package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.Post;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����1:40:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PostDao extends BaseDao<Post> {
	/**
	 * δʵ��
	 */
	@Override
	default int delete(String id) {
		return 0;
	}
	/**
	 * δʵ��
	 */
	@Override
	default Post findById(String id) {
		return null;
	}
	public int delete(int id);
	public Post findById(int id);
}
