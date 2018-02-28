package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:34:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminRole {
	private String adminId;//管理员编号
	private String roleId;//角色编号
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
}
