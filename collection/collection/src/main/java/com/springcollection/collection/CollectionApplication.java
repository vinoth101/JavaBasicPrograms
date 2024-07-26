package com.springcollection.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Javacollection j=(Javacollection)context.getBean("Javacollection");
		j.getAddressList();
		j.getAddressMap();
		j.getAddressProp();
		j.getAddressSet();
	}

}
