package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.entity.Role;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��24�� ����3:16:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface RoleDao extends BaseDao<Role> {
	public List<Role> findByParentId(String parentId);
}
