package com.example.demo;

import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot的单元测试
 *
 * 可以再测试期间很方便的蕾丝边马一样进行自动注入的容器的功能
 */

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
