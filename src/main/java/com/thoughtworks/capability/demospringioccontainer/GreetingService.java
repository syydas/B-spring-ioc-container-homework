package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

import java.util.Date;

public class GreetingService {

    public GreetingService() {
        System.out.println("GreetingService is created when " + new Date());
    }

    String sayHi() {
        return "hello world";
    }
}
