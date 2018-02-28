package cn.jcloud.sso.common;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午4:10:37 
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
