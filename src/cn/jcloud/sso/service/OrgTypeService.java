package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:45:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgTypeService extends ReBaseService<OrgType> {
	public int update(OrgType orgType);
	public OrgType getById(String orgType);
}
