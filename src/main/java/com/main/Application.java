package com.main;

import com.util.MyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EntityScan( basePackages = "com.*")
@Configuration
@EnableAutoConfiguration
@ComponentScan( basePackages = "com.*")
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories( basePackages = "com.dao" )

public class Application extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * 配置拦截器
	 * @author lance
	 * @param registry
	 */
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
}


