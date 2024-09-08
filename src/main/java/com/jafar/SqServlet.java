package com.jafar;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int ans = (int) req.getAttribute("ans");
		PrintWriter pw = res.getWriter();
		ans = ans*ans;
		pw.println("The answer is: "+ans);
		
	}
	
	
	
	
	
	private static final long serialVersionUID = 1L;

}
