package cn.jcloud.sso.dao;

import cn.jcloud.sso.entity.Degree;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��25�� ����11:28:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DegreeDao extends BaseDao<Degree> {
	/**
	 * δʵ��
	 */
	@Override
	default Degree findById(String id) {
		return null;
	}
	/**
	 * δʵ��
	 */
	@Override
	default int delete(String id) {
		return 0;
	}
	public Degree fingByid(int id);
	public int delete(int id);
}
