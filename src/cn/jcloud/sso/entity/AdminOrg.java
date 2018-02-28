package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:33:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class AdminOrg {
	private String adminId;//管理员编号
	private String orgId;//机构编号
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
}
