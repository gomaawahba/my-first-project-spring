package com.gomaawahba.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.faces.application.ProtectedViewException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gomaawahba.validation.Checkvaliduser;

@WebServlet(urlPatterns  ="/login")
public class loginservelt extends HttpServlet {
	Checkvaliduser check=new Checkvaliduser();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//    String username=req.getParameter("name");
		req.setAttribute("user",req.getParameter("name"));
		req.setAttribute("password",req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
       

	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//    String username=req.getParameter("name");
		req.setAttribute("user",req.getParameter("name"));
		req.setAttribute("password",req.getParameter("password"));
	//	req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
       boolean isvalid=check.checkvaliduser(req.getParameter("name"),req.getParameter("password") );
       if(isvalid==true) {
   		req.setAttribute("user",req.getParameter("name"));
   		req.setAttribute("password",req.getParameter("password"));
   		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
       }
       else {
    	   req.setAttribute("error","invalid user and password");
   	//	req.setAttribute("user",req.getParameter("name"));
   	//	req.setAttribute("password",req.getParameter("password"));
   		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    	   
       }
		//req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
	
	}
	
}
/*<!DOCTYPE html>
<html>
<body>

<h1>My First Heading</h1>
<p>My first paragraph.</p>

</body>
</html>*/
/*		// write code html
// we use file jsp
PrintWriter out=resp.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>ahmed</title>");
out.println("<head>");
out.println("<body>");
out.println("<h1>This the Heading</h1>");
out.println("<p> this is goal mohmed salah</p>");
out.println("<br></br>");
out.println("<p> this is goal mohmed salah</p>");
out.println("<br></br>");
out.println("<p> this is goal mohmed salah</p>");
out.println("<br></br>");
out.println("<p> this is goal mohmed salah</p>");
out.println("</body>");
out.println("</html>");*/