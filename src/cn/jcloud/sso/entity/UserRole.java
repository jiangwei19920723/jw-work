package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:47:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserRole {
	private String userId;//用户编号
	private String roleId;//角色编号
	private int hold;//拥有/排斥
	private Date expiredDate;//过期时间
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
