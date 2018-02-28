package cn.jcloud.sso.entity;

import java.util.Date;

/** 
 * 企业系统
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 上午10:59:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Software {
	private String softwareId;//企业系统编号
	private String softwareName;//企业系统名称
	private String softwareLoadIp;//企业系统登录地址
	private String softwareCallbackIp;//企业系统回调地址
	private String softwareKey;//企业系统KEY
	private	Date time;//接入时间
	private String changer;//负责人
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
