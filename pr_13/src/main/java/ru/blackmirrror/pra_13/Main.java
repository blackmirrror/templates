package ru.blackmirrror.pra_13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student person = context.getBean("student", Student.class);
        System.out.println(person.getName() + " " + person.getLast_name());
        System.out.println(person.getGroup());
    }
}