package cn.jcloud.sso.bean;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����1:43:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class FileResultBean {
	private String errorCode;//�������
	private String errorMessage;//��������
	private String fileName;//�ļ�����
	private String fileContent;//�ļ�����
	private String fileList;//�ļ��б���Ϣ
	private String fileListCount;//�ļ���
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileContent() {
		return fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	public String getFileList() {
		return fileList;
	}
	public void setFileList(String fileList) {
		this.fileList = fileList;
	}
	public String getFileListCount() {
		return fileListCount;
	}
	public void setFileListCount(String fileListCount) {
		this.fileListCount = fileListCount;
	}
	
	
}
