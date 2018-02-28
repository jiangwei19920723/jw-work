package cn.jcloud.sso.bean;

import java.io.Serializable;

import cn.jcloud.sso.common.CommonData;

public class UpdateResultBean implements Serializable {

	private static final long serialVersionUID = -8561270520445819415L;
	
	private String errorCode;//�������
	
	private String errorMessage;//������Ϣ
	
	private int count;//Ӱ��������
	
	private String[] result;//���ô洢���̷���ֵ
	
	public UpdateResultBean(String errorCode, String errorMessage, int count, String[] result){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.count = count;
		this.result = result;
	}
	
	public UpdateResultBean(){
		this.errorCode = CommonData.FAIL_STRING;
		this.errorMessage = CommonData.STRING_NULL_VALUE;
		this.count = 0;
		this.result = new String[0];
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String[] getResult() {
		return result;
	}

	public void setResult(String[] result) {
		this.result = result;
	}
	
}
