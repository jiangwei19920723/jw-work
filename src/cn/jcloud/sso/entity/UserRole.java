package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:47:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserRole {
	private String userId;//�û����
	private String roleId;//��ɫ���
	private int hold;//ӵ��/�ų�
	private Date expiredDate;//����ʱ��
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public int getHold() {
		return hold;
	}
	public void setHold(int hold) {
		this.hold = hold;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
}
