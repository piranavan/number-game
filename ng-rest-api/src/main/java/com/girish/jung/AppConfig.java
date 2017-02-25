package com.girish.jung;

import com.girish.jung.dao.DaoAppConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Configuration
@ComponentScan("com.girish.jung")
@PropertySource(value = { "classpath:application.properties" })
@Import(value = {DaoAppConfig.class} )
public class AppConfig {
}
