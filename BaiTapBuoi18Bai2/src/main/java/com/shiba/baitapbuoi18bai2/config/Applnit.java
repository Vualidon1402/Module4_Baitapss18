package com.shiba.baitapbuoi18bai2.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class Applnit extends AbstractAnnotationConfigDispatcherServletInitializer {
    // khởi tạo dispatcherServlet
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // cấu hình ko liên đến web
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // liene quan tới web
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter(
                "utf-8",true
        );
        return new Filter[]{filter};
    }
}
