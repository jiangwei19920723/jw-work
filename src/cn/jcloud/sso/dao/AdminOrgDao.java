package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminOrg;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����10:56:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminOrgDao extends ReBaseDao<AdminOrg> {
	/**
	 * ��ʵ��
	 */
	@Override
	default int update(AdminOrg entity) {
		return 0;
	}
}
