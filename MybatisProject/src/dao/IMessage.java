package dao;

import java.util.List;
import java.util.Map;

import bean.Message;

/**
 * ��Message�����ļ����Ӧ�Ľӿ�
 */
public interface IMessage {
	/**
	 * ���ݲ�ѯ������ҳ��ѯ��Ϣ�б�
	 */
	public List<Message> queryMessageList(Map<String,Object> parameter);
}
