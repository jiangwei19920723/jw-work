package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:51:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserStamp {
	private String path;//图章路径
	private String userId;//用户编号
	private	int o;//顺序
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
	}
	
	
}
