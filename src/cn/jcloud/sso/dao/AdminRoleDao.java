package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminRole;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����11:05:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminRoleDao extends ReBaseDao<AdminRole> {
	/**
	 * ��ʵ��
	 */
	@Override
	default int update(AdminRole entity) {
		return 0;
	}
}
