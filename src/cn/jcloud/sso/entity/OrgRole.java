package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:22:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class OrgRole {
	private String orgId;//机构编号
	private String roleId;//角色编号
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
}
