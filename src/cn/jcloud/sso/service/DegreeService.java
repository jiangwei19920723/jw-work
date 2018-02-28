package cn.jcloud.sso.service;

import cn.jcloud.sso.entity.Degree;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��8��29�� ����9:41:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface DegreeService extends BaseService<Degree> {
	public int deleteById(int id);
	public Degree getById(int id);
	/**
	 * ��ʵ��
	 */
	@Override
	default int deleteById(String id) {
		return 0;
	}
	/**
	 * ��ʵ��
	 */
	@Override
	default Degree getById(String id) {
		return null;
	}
}
