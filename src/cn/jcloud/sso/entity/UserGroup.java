package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:52:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserGroup {
	private String userId;//�û����
	private String groupId;//�û�����
	private Date expiredDate;//����ʱ��
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
}
