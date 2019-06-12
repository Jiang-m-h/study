package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Message;
import dao.MessageDao;
import entity.Page;

public class ListService {
	
	
	public List<Message> queryMessageList(String command,String description,Page page){
		
		Message message = new Message();
		message.setCommand(command);
		message.setDescription(description);
		MessageDao messagedao = new MessageDao();
		
		//根据条件查询条数
		int totalNumber = messagedao.count(message);
		
		page.setTotalNumber(totalNumber);
		Map<String,Object> parameter = new HashMap<String,Object>();
		parameter.put("message", message);
		parameter.put("page", page);
		
		//分页查询并返回结果
		
		return messagedao.queryMessage(parameter);
	}
	
}
