package com.techknowedge;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
	public static void main(String... a)
	{
		
Resource resource =new ClassPathResource("ApplicationContext.xml");
BeanFactory factory=new XmlBeanFactory(resource);
Employee emp=(Employee)factory.getBean("empBean");
Employee emp1=(Employee)factory.getBean("empBean1");
Employee emp2=(Employee)factory.getBean("empBean2");
emp1.displayInfo();
emp.displayInfo();
emp2.displayInfo();
	}
}
