package cn.jcloud.sso.common;

import java.sql.ResultSet;


public interface RowConverter<T> {
	/**
	 * 从ResultSet中获取当前行的数据并转换为一个实体类型的对象
	 * @param rs
	 * @return
	 */
	public T convert(ResultSet rs);
}
