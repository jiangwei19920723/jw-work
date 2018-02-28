package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * 角色
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午4:04:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Role{
	
	private String roleId;//角色编号
	private String parentId;//父编号
	private String roleName;//角色名称
	private int roleLevel;//角色级别
	private int enabled;//激活
	private String remark;//备注
	private int o;//显示顺序
	private String creator;//创建人
	private Date createTime;//创建时间
	private String modifier;//修改人
	private Date modifyTime;//修改时间
	private int version;//版本号
	
	
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
