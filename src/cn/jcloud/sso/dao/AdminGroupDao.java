package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.AdminGroup;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����11:17:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface AdminGroupDao extends ReBaseDao<AdminGroup> {
	/**
	 * ��ʵ��
	 */
	@Override
	default int update(AdminGroup entity) {
		return 0;
	}
}
