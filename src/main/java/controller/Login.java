package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import dto.User;
@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String cname=getServletName().getInitParameter("cname");
//		String cbranch=getServletName().getInitParameter("cbranch");
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
//		System.out.println("email");
//		System.out.println("password");
//		res.getWriter().print("<h1>name:"+email+"<h1>");
//		res.getWriter().print("<h1>name:"+password+"<h1>");
		Userdao dao=new Userdao();
		 User user=dao.find(email);
		 if(user==null)
		 {
			 res.getWriter().print("<h1>Invalid Email</h1>");
		 }
		 else {
			 if(dto2.user.getPassword().equals(password))
			 {
//				 res.sendRedirect("https://www.youtube.com");
				 res.getWriter().print("<h1>Login Success in</h1>");
				 List<UserDto> list = dao1.fetchAll();
				 for(UserDto u:list)
				 {
					 res.getWriter().print("<h1>Username : "+u.getName());
					 res.getWriter().print("<h1>Username : "+u.getEmail());
					 res.getWriter().print("<h1>Username : "+u.getNumber());
					 res.getWriter().print("<h1>Username : "+u.getPassword());
				 }
				 res.getWriter().print("----------------------");
			
				 
				 res.getWriter().print("<table border=\"1\">"
						 +"<tr>"
						 +"<th>UserName</th>"
						 +"<th>UserEmail</th>"
						 +"<th>Usermobile</th>"
						 +"<th>UserPassword</th>"
						 +"</tr>");
			 }
			 for(User u:list) {
				 res.getWriter().print("<tr><th>"+u.getName()+"</th>"
						 +"<th>"+u.getEmail()+"</th>"
						 +"<th>"+u.getGender()+"</th>"
						 +"<th>"+u.getPassword()+"</th>"
						 +"<th>"+u.getNumber()+"</th>"
						 +"<th>"+u.getAddress()+"</th>"
						 +"</th>"); 
			 }
		
			 res.getWriter().print("</table>");
			 else {
				 res.setContentType("text/html");
				 res.getWriter().print("<h1>Invalid password</h1>");
//				 req.getRequestDispatcher("loginpage.html").include(req, res);
				 res.sendRedirect("loginpage.html");
				 
			 }
		 }
	}
}

