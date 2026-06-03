package org.example;

import org.example.Entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s = (Student) context.getBean("student");

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getCourse());
        System.out.println(s.getAdharno());
    }
}