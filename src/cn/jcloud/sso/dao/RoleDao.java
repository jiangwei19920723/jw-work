package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.entity.Role;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月24日 下午3:16:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface RoleDao extends BaseDao<Role> {
	public List<Role> findByParentId(String parentId);
}
