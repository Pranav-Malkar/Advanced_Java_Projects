package controllers;

import java.io.IOException;
import bean.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mycontroller")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		String area = request.getParameter("area");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		int age  = Integer.parseInt(request.getParameter("age"));
		
		User user = new User(uid, pwd, fname, lname, email, contact,  area, city, pincode,age);
		
		
		request.setAttribute("current_user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("/view.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
