package org.deepocean.bootstrap;

import org.deepocean.config.AppConfig;
import org.deepocean.service.XService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author M.R.
 * @desc   test
 */
public class AnnotationConfigApplicationContextDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

		// 动态注册一个配置类
		ac.register(AppConfig.class);

		// 初始化spring容器
		ac.refresh();

		System.out.println("======= Application test start... =======");

		System.out.println(ac.getBean(XService.class.getName()));
	}
}
