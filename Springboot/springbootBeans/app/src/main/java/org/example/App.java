package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.bean.UserConfig;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        // Load the Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve the bean
        UserConfig userConfig = (UserConfig) context.getBean("userConfigBean");
        System.out.println("Name: " + userConfig.getName());
        System.out.println("Class: " + userConfig.getClassName());
    }
}

