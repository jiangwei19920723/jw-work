package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * �û���
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:23:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Group {
	private String groupId;//�û�����
	private String parentId;//�����
	private String groupName;//�û�������
	private int groupLevel;//����
	private int enabled;//����
	private String remark;//��ע
	private int o;//˳��
	private String creator;//������
	private Date createTime;//����ʱ��
	private String modifier;//�޸���
	private Date modifyTime;//�޸�ʱ��
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupLevel() {
		return groupLevel;
	}
	public void setGroupLevel(int groupLevel) {
		this.groupLevel = groupLevel;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
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
