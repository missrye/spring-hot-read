package org.source.hot.spring.overview.deepocean.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IndexService {
	@Autowired
	UserService userService;

	public IndexService() {
		System.out.println("Init IndexService.");
	}

	@PostConstruct
	public void init() {
		System.out.println("IMService PostConstruct.");
	}
}
