package cn.jcloud.sso.webservice.Impl;

import cn.jcloud.sso.bean.FileResultBean;
import cn.jcloud.sso.bean.InfoHeader;
import cn.jcloud.sso.bean.PageResultBean;
import cn.jcloud.sso.bean.QueryResultBean;
import cn.jcloud.sso.bean.UpdateResultBean;
import cn.jcloud.sso.common.EncOrDec;
import cn.jcloud.sso.webservice.SsoService;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年8月23日 下午2:08:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class SsoServiceImpl extends EncOrDec implements SsoService {

	@Override
	public String connectHost(InfoHeader infoHeader, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public String disConnectHost(String token, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public String getHostVersion(String param1, String param2, String param3) {
		return null;
	}

	@Override
	public String heartBeat(String token, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public QueryResultBean sqlQuery(String token, String sql, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public QueryResultBean sqlQueryByParams(String token, String sql, String[] params, int[] paramsType, String param1,
			String param2, String param3) {
		return null;
	}

	@Override
	public UpdateResultBean sqlUpdate(String token, String[] sql, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public UpdateResultBean sqlUpdateByParams(String token, String sql, String[] params, String[] paramsType,
			Integer paramSize, String param1, String param2, String param3) {
		return null;
	}

	@Override
	public UpdateResultBean procedureFuncrion(String token, String procedureName, String[] params, String[] paramsType,
			String param1, String param2, String param3) {
		return null;
	}

	@Override
	public PageResultBean sqlQueryForPage(String token, String sql, Integer pagesize, Integer pagenow, String param1,
			String param2, String param3) {
		return null;
	}

	@Override
	public FileResultBean fileUpload(String token, String filepath, String filename, byte[] bytes, String param1,
			String param2, String param3) {
		return null;
	}

	@Override
	public FileResultBean fileDownload(String token, String filepath, String filename, long post, String param1,
			String param2, String param3) {
		return null;
	}

	@Override
	public FileResultBean fileList(String token, String filenPath, String param1, String param2, String param3) {
		return null;
	}

	@Override
	protected String encode(String message) {
		return null;
	}

	@Override
	protected String decode(String message) {
		return null;
	}

}
