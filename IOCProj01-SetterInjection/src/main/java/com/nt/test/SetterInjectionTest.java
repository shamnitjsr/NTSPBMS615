package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hold spring bean cfg file name and location (clt+shift+o :: To import pkg)
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create IOC container (BeanFactory container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//Get target spring bean class object
		Object obj=factory.getBean("wmg");
		//typecasting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the b.method
		String result=generator.generateMessage("Shambhu");
		
		System.out.println("Wish Message is ::" +result);
		
	}

}
