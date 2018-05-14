package com.yczd.study.dubbo.demo.provider;

import com.yczd.study.dubbo.demo.common.DemoService;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		if (name == null || name == "") {
			return "Hello Wolrd!!!!";
		} else {
			return "Hello " + name;
		}
	}
}
