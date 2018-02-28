package cn.jcloud.sso.common;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午1:57:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class EncOrDec {
	/**
	 * 加密
	 * @param message 需要加密的内容
	 * @return 加密后的内容
	 */
	protected abstract String encode(String message);
	/**
	 * 解密
	 * @param message 需要解密的内容
	 * @return 解密后的内容
	 */
	protected abstract String decode(String message);
}
