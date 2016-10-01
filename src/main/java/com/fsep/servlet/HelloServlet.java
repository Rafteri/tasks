package com.fsep.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 30.09.16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = new String(req.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
        name = name == null || name.length() == 0 ? "стесняшка" : name.trim();
        System.out.println("Имя пользователя: " + name);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }
}
