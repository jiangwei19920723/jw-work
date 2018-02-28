package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.Orgleader;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:43:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgleaderService extends ReBaseService<Orgleader> {
	public int update(Orgleader orgleader);
}
