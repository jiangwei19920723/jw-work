package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * 管理员
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:29:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Admin {
	private String adminId;//管理员编号
	private String adminName;//管理员名称
	private int authenabled;//可以授权
	private String remark;//备注
	private String creator;//创建人
	private Date createTime;//创建时间
	private String modifier;//修改人
	private Date modifyTime;//修改时间
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAuthenabled() {
		return authenabled;
	}
	public void setAuthenabled(int authenabled) {
		this.authenabled = authenabled;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	
}
