package cn.jcloud.sso.bean;

import java.io.Serializable;

public class PageResultBean implements Serializable {
	
	private static final long serialVersionUID = -397820599728853776L;

	private String[][] result;//查询结果集
	
	private int resultRowCount;//查询结果集行数
	
	private int resultColCount;//查询结果集列数
	
	private int pagenow;//当前分页号
	
	private int pagesize;//每页记录条数
	
	private int rows;//总行数
	
	private int pages;//总页数
	
	private String errorCode;//错误代码
	
	private String errorMessage;//错误内容

	public String[][] getResult() {
		return result;
	}

	public void setResult(String[][] result) {
		this.result = result;
	}

	public int getPagenow() {
		return pagenow;
	}

	public void setPagenow(int pagenow) {
		this.pagenow = pagenow;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
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

	public int getResultRowCount() {
		return resultRowCount;
	}

	public void setResultRowCount(int resultRowCount) {
		this.resultRowCount = resultRowCount;
	}

	public int getResultColCount() {
		return resultColCount;
	}

	public void setResultColCount(int resultColCount) {
		this.resultColCount = resultColCount;
	}

}
