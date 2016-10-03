package com.fsep.servlet.filter;

import com.fsep.DAO.NameDao;

import javax.servlet.*;
import java.io.IOException;

/**
 * 01.10.16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class HelloFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String name = servletRequest.getParameter("name");
        if (name != null && name.trim().length() != 0) {
            NameDao.addName(name);
        } else {
            name = "стесняшка";
        }
        System.out.println("Имя пользователя: " + name);
        filterChain.doFilter(servletRequest,  servletResponse);
    }

    public void destroy() {
    }
}
