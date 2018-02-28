package cn.jcloud.sso.entity;

/** 
 * 机构主管
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:11:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Orgleader {
	private String orgId;//机构编号
	private String userId;//用户编号
	private int leaderType;//主管类型
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getLeaderType() {
		return leaderType;
	}
	public void setLeaderType(int leaderType) {
		this.leaderType = leaderType;
	}
	
	
}
