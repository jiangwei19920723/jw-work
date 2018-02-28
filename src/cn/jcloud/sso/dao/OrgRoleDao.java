package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.OrgRole;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月25日 上午10:29:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface OrgRoleDao extends ReBaseDao<OrgRole> {
	/**
	 * 空实现
	 */
	@Override
	default int update(OrgRole entity) {
		return 0;
	}
}
