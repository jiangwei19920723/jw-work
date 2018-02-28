package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:43:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserType {
	private String userType;//类型编号
	private String userTypeName;//类型名称
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	
	
}
