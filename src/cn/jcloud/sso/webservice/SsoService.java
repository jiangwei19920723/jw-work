package cn.jcloud.sso.webservice;

import cn.jcloud.sso.bean.FileResultBean;
import cn.jcloud.sso.bean.InfoHeader;
import cn.jcloud.sso.bean.PageResultBean;
import cn.jcloud.sso.bean.QueryResultBean;
import cn.jcloud.sso.bean.UpdateResultBean;

/**
 * @author 蒋维
 * @date 创建时间：2017年8月23日 下午1:17:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface SsoService {
	
	/**
	 * 客户端注册接口
	 * 
	 * @param infoHeader客户端注册信息
	 * @param param1客户端最大启动数量
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 注册后的密钥，空表示注册失败
	 */
	public String connectHost(InfoHeader infoHeader, String param1, String param2, String param3);

	/**
	 * 客户端注销接口
	 * 
	 * @param token注册后的密钥
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 注销结果 0成功，非0失败
	 */
	public String disConnectHost(String token, String param1, String param2, String param3);

	/**
	 * 获取客户端最新版本号
	 * 
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 返回客户端版本号
	 */
	public String getHostVersion(String param1, String param2, String param3);

	/**
	 * token心跳接口
	 * 
	 * @param token注册后的密钥
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 调用心跳操作结果0成功，非0失败
	 */
	public String heartBeat(String token, String param1, String param2, String param3);

	/**
	 * 查询SQL结果集
	 * 
	 * @param token注册后的密钥
	 * @param sql查询SQL
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 查询结果信息
	 */
	public QueryResultBean sqlQuery(String token, String sql, String param1, String param2, String param3);
	
	/**
	 * 查询sql结果集
	 * @param token注册后的密钥
	 * @param sql查询sql
	 * @param params查询参数，没有传空
	 * @param paramsType参数类型
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 查询结果信息
	 */
	public QueryResultBean sqlQueryByParams(String token, String sql, String[] params, int[] paramsType, String param1,
			String param2, String param3);
	/**
	 * 执行SQL更新操作
	 * @param token 注册后的密钥
	 * @param sql	批量更新SQL列表
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 查询结果信息
	 */
	public UpdateResultBean sqlUpdate(String token, String[] sql, String param1, String param2, String param3);
	/**
	 * 执行预编译SQL更新操作
	 * @param token 注册后的密钥
	 * @param sql	更新SQL，占位符采用‘%s’
	 * @param params参数信息，一维数组
	 * @param paramsType参数类型
	 * @param paramSize每行参数个数
	 * @param param1预留参数1
	 * @param param2预留参数2
	 * @param param3预留参数3
	 * @return 查询结果信息
	 */
	public UpdateResultBean sqlUpdateByParams (String token, String sql,String[] params, String[] paramsType, Integer paramSize,
			String param1, String param2, String param3);
	
	/**
	 * 执行存储过程调用操作
	 * @param token 注册后的密钥
	 * @param procedureName 存储过程名称
	 * @param params 存储过程参数列表
	 * @param paramsType 参数类型 0输入参数，1输出参数
	 * @param param1 预留参数1
	 * @param param2 预留参数2
	 * @param param3 预留参数3
	 * @return 查询结果信息
	 */
	public UpdateResultBean procedureFuncrion (String token, String procedureName,String[] params, String[] paramsType,
			String param1, String param2, String param3);
	/**
	 * 执行分页查询操作
	 * @param token 注册后的密钥
	 * @param sql 执行SQL
	 * @param pagesize 每页记录数
	 * @param pagenow 当前分页号
	 * @param param1 预留参数1
	 * @param param2 预留参数2
	 * @param param3 预留参数3
	 * @return 查询结果信息
	 */
	public PageResultBean sqlQueryForPage (String token, String sql, Integer pagesize, Integer pagenow, String param1, String param2, String param3);
	/**
	 * 文件上传操作
	 * @param token 注册后的密钥
	 * @param filepath 文件保存路径
	 * @param filename 文件名称
	 * @param bytes 文件内容
	 * @param param1 预留参数1
	 * @param param2 预留参数2
	 * @param param3 预留参数3
	 * @return 保存至服务器文件操作结果
	 */
	public FileResultBean fileUpload (String token,String filepath, String filename, byte[] bytes, String param1, String param2, String param3);
	/**
	 * 文件下载操作
	 * @param token 注册后的密钥
	 * @param filepath 文件保存路径
	 * @param filename 文件名称
	 * @param post 跳过字节数
	 * @param param1 预留参数1
	 * @param param2 预留参数2
	 * @param param3 预留参数3
	 * @return 获取文件内容结果
	 */
	public FileResultBean fileDownload (String token, String filepath, String filename, long post, String param1, String param2, String param3);
	/**
	 * 获取某路径下文件列表信息
	 * @param token 注册后的密钥
	 * @param filenPath 文件路径
	 * @param param1 预留参数1
	 * @param param2 预留参数2
	 * @param param3 预留参数3
	 * @return 文件信息列表结果
	 */
	public FileResultBean fileList (String token, String filenPath, String param1, String param2, String param3);
	
}
