package ru.blackmirrror.pr_12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HashFileProcessor processor = context.getBean(HashFileProcessor.class);
    }
}
