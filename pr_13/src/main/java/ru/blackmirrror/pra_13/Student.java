package ru.blackmirrror.pra_13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //@Autowired
    @Value("${student.name}")
    private String name;

    @Autowired
    @Value("${student.last_name}")
    private String last_name;

    @Autowired
    @Value("${student.group}")
    private String group;

    public Student() {}

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGroup() {
        return group;
    }
}
