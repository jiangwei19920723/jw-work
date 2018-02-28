package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:36:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminGroup {
	private String adminId;//管理员编号
	private String groupId;//组编号
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	
}
