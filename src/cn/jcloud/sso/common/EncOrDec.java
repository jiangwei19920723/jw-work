package cn.jcloud.sso.common;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����1:57:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class EncOrDec {
	/**
	 * ����
	 * @param message ��Ҫ���ܵ�����
	 * @return ���ܺ������
	 */
	protected abstract String encode(String message);
	/**
	 * ����
	 * @param message ��Ҫ���ܵ�����
	 * @return ���ܺ������
	 */
	protected abstract String decode(String message);
}
