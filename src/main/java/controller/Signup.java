package controller;



import java.io.IOException;

import javax.security.auth.login.AccountException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.compiler.Node.ForwardAction;

import dao.Userdao;
import dto.User;

//@WebServlet("/validation")
public class Signup extends HttpServlet{

@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
// TODO Auto-generated method stub
	String cname=getServletConfig().getInitParameter("cname");
	String cbranch=getServletConfig().getInitParameter("cbranch");
User user=new User();
user.setName(req.getParameter("name"));
user.setMobile(Long.parseLong(req.getParameter("mobile")));
user.setEmail(req.getParameter("email"));
user.setGender(req.getParameter("gender"));
user.setAddress(req.getParameter("address"));
user.setPassword(req.getParameter("password"));
        Userdao dao=new Userdao();
        dao.save(user);
//        res.getWriter().print("<h1>Account signed completed</h1>");
      req.getRequestDispatcher("loginpage.html").forward(req, res);
}

}
