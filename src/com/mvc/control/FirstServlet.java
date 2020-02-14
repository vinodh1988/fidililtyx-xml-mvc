package com.mvc.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.model.DataProvider;

/**
 * Servlet implementation class FirstServlet
 */

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DESTROY");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("SERVICE");
	}
*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String user=request.getParameter("user");
		  String password=request.getParameter("pass");
		  
		  HttpSession s=request.getSession();//Every browser connection
		                                     //with server is a session
		  
		  s.setAttribute("user", user);
		  s.setAttribute("pass", password);
		  
		  ServletContext sc=request.getServletContext();
		  sc.setAttribute("user", user);
		  sc.setAttribute("pass", password);
		  
		  request.setAttribute("user", user);
		  request.setAttribute("pass", password);
		  
		  request.setAttribute("programmers",DataProvider.getData());
		  
		  RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		  rd.forward(request,response);
		  
		//  response.sendRedirect("result.jsp");
		  
		  /*PrintWriter out=response.getWriter();
		  out.println("<div style=\" background-color:yellow;color:green;padding:10px \">");
		  out.println("Username::"+user);
		  out.println("Password::"+password);
		  out.println("</div>");*/
		  
		  //if HTML response is more , we have a technology called JSP
		  //Where we embedd java in html
		  //Whereas in servlet we embed html in java
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
