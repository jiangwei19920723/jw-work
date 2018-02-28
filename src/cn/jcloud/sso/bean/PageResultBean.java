package cn.jcloud.sso.bean;

import java.io.Serializable;

public class PageResultBean implements Serializable {
	
	private static final long serialVersionUID = -397820599728853776L;

	private String[][] result;//��ѯ�����
	
	private int resultRowCount;//��ѯ���������
	
	private int resultColCount;//��ѯ���������
	
	private int pagenow;//��ǰ��ҳ��
	
	private int pagesize;//ÿҳ��¼����
	
	private int rows;//������
	
	private int pages;//��ҳ��
	
	private String errorCode;//�������
	
	private String errorMessage;//�������ݮ�

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
