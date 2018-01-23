package com.programeticdispatcher.javaconf.abstractcontroller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class RootConfig extends WebMvcConfigurerAdapter{
    
	public RootConfig() {
    	System.out.println("inside RootConfig class constructor");
	}
}
