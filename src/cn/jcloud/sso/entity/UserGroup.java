package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:52:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class UserGroup {
	private String userId;//用户编号
	private String groupId;//用户组编号
	private Date expiredDate;//过期时间
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
