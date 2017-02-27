package com.girish.jung.config;

import com.girish.jung.config.SecurityConfig;
import com.girish.jung.dao.DaoAppConfig;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by girishjung on 25/02/2017.
 */
@Configuration
@ComponentScan("com.girish.jung")
@PropertySource(value = { "classpath:application.properties" })
@Import(value = {DaoAppConfig.class, SecurityConfig.class} )
public class AppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver
                = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
