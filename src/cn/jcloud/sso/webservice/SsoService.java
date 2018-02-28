package cn.jcloud.sso.webservice;

import cn.jcloud.sso.bean.FileResultBean;
import cn.jcloud.sso.bean.InfoHeader;
import cn.jcloud.sso.bean.PageResultBean;
import cn.jcloud.sso.bean.QueryResultBean;
import cn.jcloud.sso.bean.UpdateResultBean;

/**
 * @author ��ά
 * @date ����ʱ�䣺2017��8��23�� ����1:17:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface SsoService {
	
	/**
	 * �ͻ���ע��ӿ�
	 * 
	 * @param infoHeader�ͻ���ע����Ϣ
	 * @param param1�ͻ��������������
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ע������Կ���ձ�ʾע��ʧ��
	 */
	public String connectHost(InfoHeader infoHeader, String param1, String param2, String param3);

	/**
	 * �ͻ���ע���ӿ�
	 * 
	 * @param tokenע������Կ
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ע����� 0�ɹ�����0ʧ��
	 */
	public String disConnectHost(String token, String param1, String param2, String param3);

	/**
	 * ��ȡ�ͻ������°汾��
	 * 
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ���ؿͻ��˰汾��
	 */
	public String getHostVersion(String param1, String param2, String param3);

	/**
	 * token�����ӿ�
	 * 
	 * @param tokenע������Կ
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ���������������0�ɹ�����0ʧ��
	 */
	public String heartBeat(String token, String param1, String param2, String param3);

	/**
	 * ��ѯSQL�����
	 * 
	 * @param tokenע������Կ
	 * @param sql��ѯSQL
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public QueryResultBean sqlQuery(String token, String sql, String param1, String param2, String param3);
	
	/**
	 * ��ѯsql�����
	 * @param tokenע������Կ
	 * @param sql��ѯsql
	 * @param params��ѯ������û�д���
	 * @param paramsType��������
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public QueryResultBean sqlQueryByParams(String token, String sql, String[] params, int[] paramsType, String param1,
			String param2, String param3);
	/**
	 * ִ��SQL���²���
	 * @param token ע������Կ
	 * @param sql	��������SQL�б�
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public UpdateResultBean sqlUpdate(String token, String[] sql, String param1, String param2, String param3);
	/**
	 * ִ��Ԥ����SQL���²���
	 * @param token ע������Կ
	 * @param sql	����SQL��ռλ�����á�%s��
	 * @param params������Ϣ��һά����
	 * @param paramsType��������
	 * @param paramSizeÿ�в�������
	 * @param param1Ԥ������1
	 * @param param2Ԥ������2
	 * @param param3Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public UpdateResultBean sqlUpdateByParams (String token, String sql,String[] params, String[] paramsType, Integer paramSize,
			String param1, String param2, String param3);
	
	/**
	 * ִ�д洢���̵��ò���
	 * @param token ע������Կ
	 * @param procedureName �洢��������
	 * @param params �洢���̲����б�
	 * @param paramsType �������� 0���������1�������
	 * @param param1 Ԥ������1
	 * @param param2 Ԥ������2
	 * @param param3 Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public UpdateResultBean procedureFuncrion (String token, String procedureName,String[] params, String[] paramsType,
			String param1, String param2, String param3);
	/**
	 * ִ�з�ҳ��ѯ����
	 * @param token ע������Կ
	 * @param sql ִ��SQL
	 * @param pagesize ÿҳ��¼��
	 * @param pagenow ��ǰ��ҳ��
	 * @param param1 Ԥ������1
	 * @param param2 Ԥ������2
	 * @param param3 Ԥ������3
	 * @return ��ѯ�����Ϣ
	 */
	public PageResultBean sqlQueryForPage (String token, String sql, Integer pagesize, Integer pagenow, String param1, String param2, String param3);
	/**
	 * �ļ��ϴ�����
	 * @param token ע������Կ
	 * @param filepath �ļ�����·��
	 * @param filename �ļ�����
	 * @param bytes �ļ�����
	 * @param param1 Ԥ������1
	 * @param param2 Ԥ������2
	 * @param param3 Ԥ������3
	 * @return �������������ļ��������
	 */
	public FileResultBean fileUpload (String token,String filepath, String filename, byte[] bytes, String param1, String param2, String param3);
	/**
	 * �ļ����ز���
	 * @param token ע������Կ
	 * @param filepath �ļ�����·��
	 * @param filename �ļ�����
	 * @param post �����ֽ���
	 * @param param1 Ԥ������1
	 * @param param2 Ԥ������2
	 * @param param3 Ԥ������3
	 * @return ��ȡ�ļ����ݽ��
	 */
	public FileResultBean fileDownload (String token, String filepath, String filename, long post, String param1, String param2, String param3);
	/**
	 * ��ȡĳ·�����ļ��б���Ϣ
	 * @param token ע������Կ
	 * @param filenPath �ļ�·��
	 * @param param1 Ԥ������1
	 * @param param2 Ԥ������2
	 * @param param3 Ԥ������3
	 * @return �ļ���Ϣ�б���
	 */
	public FileResultBean fileList (String token, String filenPath, String param1, String param2, String param3);
	
}
