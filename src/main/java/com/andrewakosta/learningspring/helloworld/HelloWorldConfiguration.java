package com.andrewakosta.learningspring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Andrew";
    }

    @Bean
    public int age() {
        return 22;
    }
    @Bean
    public Person person(){
        return new Person("Andrew", 22, new Address("123 Main St", "New York"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("123 Main St", "New York");
    }

    @Bean
    @Primary
    public Address address3(){
        return new Address("Baker Street", "London");
    }

}
