package com.go1ove.atcrowdfunding.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author go1ove
 * @create 2019-04-29-20:32
 */
public class StartSystemListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String contextPath = context.getContextPath();
        context.setAttribute("APP_PATH",contextPath);
        System.out.println("listener...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
