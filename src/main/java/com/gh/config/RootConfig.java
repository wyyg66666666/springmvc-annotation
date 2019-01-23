package com.gh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="com.gh",
   //配置不扫描带EnableWebMvc注解的类
	excludeFilters= {
			@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)
	}
)
public class RootConfig {

}
