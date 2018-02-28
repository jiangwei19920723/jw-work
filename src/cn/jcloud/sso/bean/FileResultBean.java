package cn.jcloud.sso.bean;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午1:43:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class FileResultBean {
	private String errorCode;//错误代码
	private String errorMessage;//错误内容
	private String fileName;//文件名称
	private String fileContent;//文件内容
	private String fileList;//文件列表信息
	private String fileListCount;//文件数
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
