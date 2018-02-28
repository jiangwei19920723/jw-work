package cn.jcloud.sso.service;

import java.util.List;

import cn.jcloud.sso.entity.Role;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月28日 下午4:44:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface RoleService extends BaseService<Role> {
	public List<Role> getByParentId(String parentId);
}
