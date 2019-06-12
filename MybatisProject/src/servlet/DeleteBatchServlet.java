package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MaintainService;

/**
 * ����ɾ�����Ʋ�
 *
 */
@SuppressWarnings("serial")
public class DeleteBatchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//���ñ���
		req.setCharacterEncoding("UTF-8");
		//����ҳ�洫ֵ
		String[] ids = req.getParameterValues("id");
		
		MaintainService maintainService = new MaintainService();
		int deletestatus = maintainService.deleteBatch(ids);
		
		//��ת
		req.getRequestDispatcher("/list.action").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
}
