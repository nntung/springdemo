package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World!");
        System.out.println("String version: " + SpringVersion.getVersion());

        Person person = new Person();
        person.setFirstName("Tung");
        person.setLastName("Nguyen");
        System.out.println(person.getName());
        System.out.println(person);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person p2 = (Person) context.getBean("Person");
        p2.setFirstName("Nga");
        p2.setLastName("Nguyen");
        System.out.println(p2.getName());
        System.out.println(p2);

        context.close();
    }
}
