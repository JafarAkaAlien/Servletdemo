package com.jafar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("no1"));
		int b= Integer.parseInt(req.getParameter("no2"));
		int ans = a+b;
		
		req.setAttribute("ans", ans);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		
		rd.forward(req, res);
		
		
		/*
		PrintWriter pw = res.getWriter();
		pw.println("The answer is: " + ans);
		*/
		
	}
	
	
	
	private static final long serialVersionUID = 1L;

}
