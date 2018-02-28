package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:28:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GroupRole {
	private String groupId;//用户组编号
	private String roleId;//角色编号
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
}
