package cn.jcloud.sso.entity;

/** 
 * ��������
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:11:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Orgleader {
	private String orgId;//�������
	private String userId;//�û����
	private int leaderType;//��������
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
