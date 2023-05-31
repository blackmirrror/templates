package ru.blackmirrror.pr_10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Fighter fighter = context.getBean(Boxer.class);
        fighter.doFight();
    }
}
