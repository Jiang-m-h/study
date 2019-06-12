package dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import bean.Message;
import db.DBAccess;

public class MessageDao {
	
	
	public List<Message> queryMessage(Map<String,Object> parameter) {
	
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		List<Message> messageList = new ArrayList<Message>();
		
		try {
			sqlSession = dbAccess.getSqlSession();
			
			IMessage imessage = sqlSession.getMapper(IMessage.class);
			messageList = imessage.queryMessageList(parameter);
			
			//注意，selectList只能传递一个参数，如果有多个参数，必须封装起来
			//messageList = sqlSession.selectList("Message.queryMessageList",parameter);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}finally { 
			if(sqlSession!=null)
				sqlSession.close();
		}
		
		return messageList;
		
	}	
	
	/**
	 * 单条删除
	 */
	public int deleteOne(int id) {
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			
			//注意，selectList只能传递一个参数，如果有多个参数，必须封装起来
			int deletestatus = sqlSession.delete("dao.IMessage.deleteOne",id);
			sqlSession.commit();
			return deletestatus;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}finally { 
			if(sqlSession!=null)
				sqlSession.close();
		}
		return 0;
		
	}
	
	/**
	 *  批量删除
	 */
	public int deleteBatch(List<Integer> ids) {
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			
			//注意，selectList只能传递一个参数，如果有多个参数，必须封装起来
			int deletestatus = sqlSession.delete("dao.IMessage.deleteBatch",ids);
			sqlSession.commit();
			return deletestatus;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}finally { 
			if(sqlSession!=null)
				sqlSession.close();
		}
		return 0;
		
	}
	
	
	public int count(Message message) {
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		int result = 0;
		try {
			sqlSession = dbAccess.getSqlSession();
			//通过sqlSession执行SQL语句
			result = sqlSession.selectOne("dao.IMessage.count",message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(sqlSession!=null)
				sqlSession.close();
		}
		
		return result;
	}
	
	
//	public List<Message> queryMessage(String command,String description) {
//		
//		List<Message> messageList = new ArrayList<Message>();
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatistest", "root", "root");
//			StringBuilder sql = new StringBuilder("select * from message where 1=1");
//			List<String> paramList = new ArrayList<String>();
//			if(command!=null&&!"".equals(command.trim())) {
//				sql.append(" and COMMAND = ? ");
//				paramList.add(command);
//			}
//			if(description!=null&&!"".equals(description.trim())) {
//				sql.append(" and DESCRIPTION like '%' ? '%' ");
//				paramList.add(description);
//			}
//			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql.toString());
//			for (int i = 0; i < paramList.size(); i++) {
//				statement.setString(i+1, paramList.get(i));
//			}
//			ResultSet rs = statement.executeQuery();
//			
//			while(rs.next()) {
//				Message ms = new Message();
//				ms.setId(rs.getInt("ID"));
//				ms.setCommand(rs.getString("COMMAND"));
//				ms.setDescription(rs.getString("DESCRIPTION"));
//				ms.setContent(rs.getString("CONTENT"));
//				messageList.add(ms);
//			}
//			
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		}
//		
//		return messageList;
//		
//	}

}
