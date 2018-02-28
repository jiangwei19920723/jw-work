package cn.jcloud.sso.entity;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午9:29:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RolePrivilege {

	private String roleId;//角色编号
	private String doMain;//域
	private int type;//权限类型
	private String rId;//资源编号
	private String pId;//权限编号
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getDoMain() {
		return doMain;
	}
	public void setDoMain(String doMain) {
		this.doMain = doMain;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getrId() {
		return rId;
	}
	public void setrId(String rId) {
		this.rId = rId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}

}
