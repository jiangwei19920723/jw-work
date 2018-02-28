package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:42:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Post {
	private int postId;//职位编号
	private String postName;//职位名称
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
	
}
