package com.girish.jung;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by girishjung on 25/02/2017.
 */
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
                .addMappingForUrlPatterns(null, false, "*//*");

        super.onStartup(servletContext);
    }*/

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /*@Override
    protected Filter[] getServletFilters() {
        return new Filter[] { new DelegatingFilterProxy("springSecurityFilterChain")};
    }*/
}