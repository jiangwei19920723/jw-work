package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:45:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgTypeService extends ReBaseService<OrgType> {
	public int update(OrgType orgType);
	public OrgType getById(String orgType);
}
