package com.yczd.hp.web.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Example
 * @author ZHU
 *
 */
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		if (name == null || name == "") {
			name = "world";
		}

		req.setAttribute("name", name);
		req.setAttribute("greeting", "Hello " + name + "!");
		req.getRequestDispatcher("greeting.jsp").forward(req, resp);

	}

}
