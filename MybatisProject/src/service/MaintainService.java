package service;

import java.util.ArrayList;
import java.util.List;

import dao.MessageDao;

public class MaintainService {
	
	
	/**
	 * ����ɾ��
	 */
	public int deleteOne(String id) {
		if(id!=null && !"".equals(id.trim())) {
			MessageDao messagedao = new MessageDao();
			int deletestatus = messagedao.deleteOne(Integer.valueOf(id));
			return deletestatus;
		}
		return 0;
	}
	
	/**
	 * ����ɾ��
	 */
	public int deleteBatch(String [] ids) {
		MessageDao messagedao = new MessageDao();
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
		int deletestatus = messagedao.deleteBatch(idList);
		return deletestatus;
		
	}
	

}
