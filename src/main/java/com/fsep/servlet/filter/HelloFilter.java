package com.fsep.servlet.filter;

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
        String name = new String(servletRequest.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
        name = name == null || name.length() == 0 ? "стесняшка" : name.trim();
        System.out.println("Имя пользователя: " + name);
        filterChain.doFilter(servletRequest,  servletResponse);
    }

    public void destroy() {
    }
}
