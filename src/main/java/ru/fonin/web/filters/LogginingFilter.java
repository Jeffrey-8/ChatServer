package ru.fonin.web.filters;

import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class LogginingFilter implements Filter {



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter worked");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("do filter worked");
    }

    @Override
    public void destroy() {

    }
}
