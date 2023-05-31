package ru.blackmirrror.pr_10;

import org.springframework.stereotype.Component;

@Component
public class Boxer implements Fighter{
    public void doFight() {
        System.out.println("Boxer");
    }
}
