package org.source.hot.spring.overview.deepocean.bootstrap;

import org.source.hot.spring.overview.deepocean.config.AppConfig;
import org.source.hot.spring.overview.deepocean.entity.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		IndexService imService = ac.getBean(IndexService.class);

		IndexService indexService = (IndexService) ac.getBean("indexService");
	}
}
