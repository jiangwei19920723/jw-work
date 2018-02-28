package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * 用户组
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:23:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Group {
	private String groupId;//用户组编号
	private String parentId;//父编号
	private String groupName;//用户组名称
	private int groupLevel;//级别
	private int enabled;//激活
	private String remark;//备注
	private int o;//顺序
	private String creator;//创建人
	private Date createTime;//创建时间
	private String modifier;//修改人
	private Date modifyTime;//修改时间
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
