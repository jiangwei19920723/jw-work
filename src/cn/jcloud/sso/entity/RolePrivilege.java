package cn.jcloud.sso.entity;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����9:29:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class RolePrivilege {

	private String roleId;//��ɫ���
	private String doMain;//��
	private int type;//Ȩ������
	private String rId;//��Դ���
	private String pId;//Ȩ�ޱ��
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
