package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.OrgRole;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����10:29:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgRoleDao extends ReBaseDao<OrgRole> {
	/**
	 * ��ʵ��
	 */
	@Override
	default int update(OrgRole entity) {
		return 0;
	}
}
