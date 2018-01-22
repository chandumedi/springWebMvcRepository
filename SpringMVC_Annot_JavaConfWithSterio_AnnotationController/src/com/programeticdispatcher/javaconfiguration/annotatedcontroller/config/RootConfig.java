package com.programeticdispatcher.javaconfiguration.annotatedcontroller.config;

import org.springframework.context.annotation.Configuration;

/*This class is used to make the different components as beans inside ioc container
 * like dao.dto,service e.t.c */
@Configuration
public class RootConfig {
  public RootConfig() {
	  System.out.println("inside RootConfig class constructor");
}
}
