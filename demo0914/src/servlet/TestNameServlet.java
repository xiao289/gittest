package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNameServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   ///1.���ܲ���
		String name=req.getParameter("uname");
		//2.�ж��Ƿ����
		String str="";
		if(name.equals("admin")) {
			str="�û����Ѵ���";
		}else {
			str="�û�������";
		}
		//3.ͨ����������ظ�ҳ��
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.write(str);
		
		
		
		
		
	}

}
