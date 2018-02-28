package cn.jcloud.sso.bean;

import java.io.Serializable;

public class InfoHeader implements Serializable{

	private static final long serialVersionUID = 283226829119762933L;

	private String host;//调用方IP
	
	private String port;//调用方接口
	
	private String expiration;//签名有限期yyyy-mm-dd
	
	private String code;//加密编码
	
	private String group;//分组
	
	private String Encryption;//是否加密传输，0否，1是
	
	private String signature;//签名
	
	private String version;//当前版本

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEncryption() {
		return Encryption;
	}

	public void setEncryption(String encryption) {
		Encryption = encryption;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
