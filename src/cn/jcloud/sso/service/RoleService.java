package cn.jcloud.sso.service;

import java.util.List;

import cn.jcloud.sso.entity.Role;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��28�� ����4:44:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface RoleService extends BaseService<Role> {
	public List<Role> getByParentId(String parentId);
}
