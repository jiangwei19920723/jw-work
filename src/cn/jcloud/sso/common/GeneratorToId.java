package cn.jcloud.sso.common;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��23�� ����4:10:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class GeneratorToId {
	public static String getStringId(){
		return System.currentTimeMillis()+"";
	}
	public static int getIntId(){
		return (int) System.currentTimeMillis();
	}
}
