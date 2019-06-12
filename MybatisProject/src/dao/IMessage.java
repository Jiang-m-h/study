package dao;

import java.util.List;
import java.util.Map;

import bean.Message;

/**
 * 与Message配置文件相对应的接口
 */
public interface IMessage {
	/**
	 * 根据查询条件分页查询消息列表
	 */
	public List<Message> queryMessageList(Map<String,Object> parameter);
}
