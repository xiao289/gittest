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
		   ///1.接受参数
		String name=req.getParameter("uname");
		//2.判断是否存在
		String str="";
		if(name.equals("admin")) {
			str="用户名已存在";
		}else {
			str="用户名可用";
		}
		//3.通过输出流返回给页面
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.write(str);
		
		
		
		
		
	}

}
