package cn.jcloud.sso.bean;

import java.io.Serializable;

public class QueryResultBean implements Serializable {
	
	private static final long serialVersionUID = 8323858048646461526L;

	private String errorCode; //错误代码
	
	private String errorMessage;//错误内容
	
	private String rowCount;//总行数
	
	private String colCount;//总列数
	
	private String[][] result;//结果集
	
	

	public QueryResultBean() {
		super();
	}

	public QueryResultBean(String errorCode, String errorMessage, String rowCount, String colCount, String[][] result) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.rowCount = rowCount;
		this.colCount = colCount;
		this.result = result;
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

	public String getRowCount() {
		return rowCount;
	}

	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

	public String getColCount() {
		return colCount;
	}

	public void setColCount(String colCount) {
		this.colCount = colCount;
	}

	public String[][] getResult() {
		return result;
	}

	public void setResult(String[][] result) {
		this.result = result;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
