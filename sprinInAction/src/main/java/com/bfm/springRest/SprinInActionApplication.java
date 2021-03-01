package com.bfm.springRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bfm.Controller")
public class SprinInActionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SprinInActionApplication.class, args);
		String[] names = ctx.getBeanDefinitionNames();
		for(String name : names){
			//System.out.println("!!!!!! names "+name);
		}
	}

}
