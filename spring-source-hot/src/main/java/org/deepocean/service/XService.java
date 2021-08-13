package org.deepocean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XService {
    @Autowired
    private YService yService;

    public XService() {
        System.out.println("XService create.");
    }
}
