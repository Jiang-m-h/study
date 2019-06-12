package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.MaintainService;

public class DeleteOneServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码
		req.setCharacterEncoding("UTF-8");
		//接收页面传值
		String id = req.getParameter("id");
		
		MaintainService maintainService = new MaintainService();
		int deletestatus = maintainService.deleteOne(id);
		
		//跳转
		req.getRequestDispatcher("/list.action").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

	
}
