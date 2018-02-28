package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.RolePrivilege;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月29日 上午9:46:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface RolePrivilegeService extends ReBaseService<RolePrivilege> {
	public int update(RolePrivilege rolePrivilege);
}
