package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * ��ɫ
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����4:04:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Role{
	
	private String roleId;//��ɫ���
	private String parentId;//�����
	private String roleName;//��ɫ����
	private int roleLevel;//��ɫ����
	private int enabled;//����
	private String remark;//��ע
	private int o;//��ʾ˳��
	private String creator;//������
	private Date createTime;//����ʱ��
	private String modifier;//�޸���
	private Date modifyTime;//�޸�ʱ��
	private int version;//�汾��
	
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
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
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
