package com.example;

import com.example.bean.Person;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootQuickApplicationTests {



    @Autowired
    ApplicationContext ioc;
    @Test
    public void testHelloService(){
        System.out.println(ioc.containsBean("helloService"));
    }


    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(person.getLastName());
    }




}
