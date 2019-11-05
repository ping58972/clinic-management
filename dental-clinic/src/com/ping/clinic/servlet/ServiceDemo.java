package com.ping.clinic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceDemo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String str34 = req.getParameter("name") + " " + req.getParameter("pas");
		PrintWriter pout = res.getWriter();
		pout.println(str34);
		
		req.setAttribute("haha", str34);
		req.getRequestDispatcher("link-other.jsp").forward(req, res);
	}

}
