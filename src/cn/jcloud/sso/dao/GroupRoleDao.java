package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.GroupRole;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����10:41:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface GroupRoleDao extends ReBaseDao<GroupRole> {
	/**
	 * ��ʵ��
	 */
	@Override
	default int update(GroupRole entity) {
		return 0;
	}
}
