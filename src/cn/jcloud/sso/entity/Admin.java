package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * ����Ա
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:29:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Admin {
	private String adminId;//����Ա���
	private String adminName;//����Ա����
	private int authenabled;//������Ȩ
	private String remark;//��ע
	private String creator;//������
	private Date createTime;//����ʱ��
	private String modifier;//�޸���
	private Date modifyTime;//�޸�ʱ��
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
