package cn.jcloud.sso.dao;

import java.util.List;

import cn.jcloud.sso.entity.OrgType;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����10:20:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgTypeDao extends ReBaseDao<OrgType> {
	public OrgType find(String orgtype);
	/**
	 * ��ʵ��
	 */
	@Override
	default List<OrgType> find(OrgType entity) {
		return null;
	}
}
