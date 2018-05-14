package com.yczd.study.dubbo.demo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	private static final Logger LOGGER = LoggerFactory.getLogger(Provider.class);

	public static void main(String[] args) throws Exception {

		LOGGER.debug("Starting the service......");
		new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/yczd-dubbo-study-provider.xml" }).start();

		LOGGER.debug("Started the service.");
		// press any key to exit
		System.in.read();

	}

}
