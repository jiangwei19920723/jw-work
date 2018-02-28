package cn.jcloud.sso.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class DBUtils {

	public static Connection getConnection() throws SQLException{
		return JdbcUtils.getConnection();
	}
	
	/**
	 * 执行insert update delete语句,并返回受影响的行数
	 */
	public static int executeUpdate(String sql, Object... params){
		if(Objects.isNull(sql)) return 0;
		try(Connection conn = getConnection()){
			try(PreparedStatement ps = conn.prepareStatement(sql)){
				if(params.length > 0){
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				JdbcUtils.beginTransaction();//开启事务
				int result = ps.executeUpdate();
				JdbcUtils.commitTransaction();//提交事务
				return result;
			}
		}catch(Exception e){
			e.printStackTrace();
			try {
				JdbcUtils.releaseConnection(getConnection());//回滚事务
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}
	
	/**
	 * 执行sql查询
	 * @param converter 一个行转换器，将ResultSet中的一行数据转换为实体对象
	 * @param sql 要执行的sql语句
	 * @param params 参数
	 * @return 查询的实体对象集合
	 */
	public static <T> List<T> executeQuery(RowConverter<T> converter, String sql, Object... params){
		List<T> list = new ArrayList<>();
		if(Objects.isNull(sql)) return list;
		try(Connection conn = getConnection()){
			try(PreparedStatement ps = conn.prepareStatement(sql)){
				if(params.length > 0){
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()){
						//从resultset中读取一行数据，并转换为实体对象
						T entity = converter.convert(rs);
						list.add(entity);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public static int executeQueryWithUniqueResult(String sql, Object... params){
		if(Objects.isNull(sql)) return 0;
		try(Connection conn = getConnection()){
			try(PreparedStatement ps = conn.prepareStatement(sql)){
				if(params.length > 0){
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				try(ResultSet rs = ps.executeQuery()){
					if(rs.next()){
						return rs.getInt(1);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
}
