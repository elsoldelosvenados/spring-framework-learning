package com.andrewakosta.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //Load the Spring container
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Configure the things we want spring to manage
        //HelloWorldConfiguration.class is a configuration class
        //the @Bean annotation tells spring to manage the return value of the method

         //Retrieve the bean from the Spring container

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        //System.out.println(context.getBean(Address.class));
    }
}
