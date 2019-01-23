package com.gh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//声明一个控制器
@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String home() {
		//视图名 为home
		return "home";
	}

}
