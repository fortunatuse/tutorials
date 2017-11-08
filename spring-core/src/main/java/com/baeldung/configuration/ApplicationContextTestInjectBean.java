package com.baeldung.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.baeldung.beaninjection"})
public class ApplicationContextTestInjectBean {
}
