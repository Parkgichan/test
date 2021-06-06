package test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet{
	Member[]Members=new Member[10];
	
	ServletContext sc;
	
	public void init(ServletConfig config) throws ServletException
	{
		sc=config.getServletContext(); 
		Members= (Member[]) sc.getAttribute("Members");
	}
	@Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	 {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String admin_id=sc.getInitParameter("id");
		String admin_pwd=sc.getInitParameter("pwd");
		
		 int i;
		 resp.setContentType("text/html;charset=UTF-8");
		 
		 PrintWriter out = resp.getWriter();
		 
		 out.print("<html><head><title>LoginComplict</title></head>");
		 if(id.equals(admin_id) && pwd.equals(admin_pwd)) {
			 RequestDispatcher rd=sc.getRequestDispatcher("/admin.jsp");
			 rd.forward(req, resp);
		 } 
		 else if(id.equals(admin_id)&&!pwd.equals(admin_pwd)) {
			 out.print("<body><h2>������ ��й�ȣ�� Ʋ���ϴ�.</h2></body>");
		 }
		 else {
			 for(i=0;i<Member.getCount()+1;i++)
			 {
				 if(Members[i].getId().equals(id))
				 {
					 break;
				 }
			 }
			 if(i==Member.getCount()+1)
			 {
				 String errmsg="���̵� �ٽ� ���ּ���.";
				 req.setAttribute("errMSG", errmsg);
				 RequestDispatcher rd=sc.getRequestDispatcher("/index.jsp");
				 rd.forward(req,resp);
			 }
			 else if(Members[i].getPwd().equals(pwd))
			 {
				 out.print("<body><h2>"+Members[i].getId()+"�Բ��� �α��� �ϼ̽��ϴ�."+(i+1)+"��° ȸ���Դϴ�.</h2></body>");
				 
			 }
			 else
			 {
				 String errmsg="��й�ȣ�� �ٽ� ���ּ���.";
				 req.setAttribute("errMSG", errmsg);
				 RequestDispatcher rd=sc.getRequestDispatcher("/index.jsp");
				 rd.forward(req,resp);
			 }
		 }
		 out.print("</html>");
		 out.close();
			
	 }
	
}