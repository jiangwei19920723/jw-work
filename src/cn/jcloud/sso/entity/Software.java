package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * ��ҵϵͳ
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����10:59:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Software {
	private String softwareId;//��ҵϵͳ���
	private String softwareName;//��ҵϵͳ����
	private String softwareLoadIp;//��ҵϵͳ��¼��ַ
	private String softwareCallbackIp;//��ҵϵͳ�ص���ַ
	private String softwareKey;//��ҵϵͳKEY
	private	Date time;//����ʱ��
	private String changer;//������
	public String getSoftwareId() {
		return softwareId;
	}
	public void setSoftwareId(String softwareId) {
		this.softwareId = softwareId;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getSoftwareLoadIp() {
		return softwareLoadIp;
	}
	public void setSoftwareLoadIp(String softwareLoadIp) {
		this.softwareLoadIp = softwareLoadIp;
	}
	public String getSoftwareCallbackIp() {
		return softwareCallbackIp;
	}
	public void setSoftwareCallbackIp(String softwareCallbackIp) {
		this.softwareCallbackIp = softwareCallbackIp;
	}
	public String getSoftwareKey() {
		return softwareKey;
	}
	public void setSoftwareKey(String softwareKey) {
		this.softwareKey = softwareKey;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	
	
	
}
