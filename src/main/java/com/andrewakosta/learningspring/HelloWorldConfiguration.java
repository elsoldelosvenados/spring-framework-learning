package com.andrewakosta.learningspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {};
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
        return new Person("Andrew", 22);
    }

    @Bean
    public Address address(){
        return new Address("123 Main St", "New York");
    }
}
