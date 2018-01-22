package com.programeticdispatcher.javaconfig.config;

import org.springframework.context.annotation.Configuration;

/*This class is used to configure Rest of the components in IOC Container 
 * like DAO DTO Service e.t.c*/
@Configuration
public class RootConfig {
   public RootConfig() {
	System.out.println("RootConfig class constructor");   
  }
}
