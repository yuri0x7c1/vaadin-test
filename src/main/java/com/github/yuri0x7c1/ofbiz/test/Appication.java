package com.github.yuri0x7c1.ofbiz.test;

import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Appication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Appication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Appication.class, args);
	}

	@Bean
	public Delegator delegator() {
		final String DELEGATOR_NAME = "default";
		log.info("Setup Entity Engine Delegator with name: {}", DELEGATOR_NAME);
		return DelegatorFactory.getDelegator(DELEGATOR_NAME);
	}

	@Bean
	public LocalDispatcher dispatcher() {
		final String DISPATCHER_NAME = "vaadin-test";
		log.info("Setup Service Engine Dispatcher with name: {}", DISPATCHER_NAME);
		return ServiceContainer.getLocalDispatcher(DISPATCHER_NAME, delegator());
	}
}
