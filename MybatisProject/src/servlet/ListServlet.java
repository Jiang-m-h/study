package servlet;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Page;
import service.ListService;


public class ListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码
		req.setCharacterEncoding("UTF-8");
		//接收页面传值
		String command = req.getParameter("command");
		String description = req.getParameter("description");
		String currentPage = req.getParameter("currentPage");
		//创建分页对象
		Page page = new Page();
		Pattern pattern = Pattern.compile("[0-9]{1,9}");
		if(currentPage == null || !pattern.matcher(currentPage).matches()) {
			page.setCurrentPage(1);
		} else {
			page.setCurrentPage(Integer.valueOf(currentPage));
		}
		
		
		//查询消息列表并返回前台页面
		ListService listService = new ListService();
		req.setAttribute("messageList", listService.queryMessageList(command, description, page));
		
		//向页面传值
		req.setAttribute("command", command);
		req.setAttribute("description", description);
		req.setAttribute("page", page);
		//跳转
		req.getRequestDispatcher("/WEB-INF/jsp/back/my.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
