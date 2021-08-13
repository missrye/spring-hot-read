package org.deepocean.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("org.deepocean.service")
public class AppConfig {
}
