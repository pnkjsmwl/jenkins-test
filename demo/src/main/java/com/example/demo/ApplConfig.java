package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.token.filter.AuthorizeFilter;

@Configuration
public class ApplConfig {

	@Bean
	public FilterRegistrationBean<AuthorizeFilter> registerTokenValidationFilter(AuthorizeFilter authorizeFilter)
	{
		FilterRegistrationBean<AuthorizeFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(authorizeFilter);
		registrationBean.setOrder(1);
		return registrationBean;
	}

}
