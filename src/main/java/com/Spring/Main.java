package com.Spring;

import com.Spring.DependencyInjection.BeanandComponent.forBean;
import com.Spring.DependencyInjection.Qualifier.WorldFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}
	@Bean
	public forBean getbean(){
		return new forBean();
	}

	@Bean
	public WorldFile getworldfile(){
		return new WorldFile();
	}


}


