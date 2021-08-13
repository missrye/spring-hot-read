package org.source.hot.spring.overview.deepocean.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	IndexService indexService;

	public UserService() {
		System.out.println("Init UserService.");
	}
}
