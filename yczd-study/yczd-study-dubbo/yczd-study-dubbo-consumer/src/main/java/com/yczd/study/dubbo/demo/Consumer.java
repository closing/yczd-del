package com.yczd.study.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yczd.study.dubbo.demo.common.DemoService;

public class Consumer {
	public void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/yczd-dubbo-study-consumer.xml" });) {

			context.start();
			DemoService demoService = (DemoService) context.getBean("demoService");

			String hello = demoService.sayHello("");

			System.out.println(hello);

			hello = demoService.sayHello("dubbo");

			System.out.println(hello);
		}
	}

}
