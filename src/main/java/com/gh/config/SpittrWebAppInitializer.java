package com.gh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 扩展 AbstractAnnotation-ConfigDispatcherServletInitializer 的任
 * 意类都会自动地配置 Dispatcher-Servlet 和 Spring 应用上下文， Spring 的应用上下文会位于应用程序的 Servlet 上下文之中。
 * @author Test
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//指定配置类
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//将DispatcherServlet映射到"/"
		return new String[]{ "/" };
	}

}
