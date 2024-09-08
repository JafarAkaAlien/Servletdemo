package com.jafar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet {

	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("no1"));
		int b= Integer.parseInt(req.getParameter("no2"));
		int ans = a+b;
		PrintWriter pw = res.getWriter();
		pw.println("The answer is: " + ans);
		
		
	}
	
	
	
	private static final long serialVersionUID = 1L;

}
