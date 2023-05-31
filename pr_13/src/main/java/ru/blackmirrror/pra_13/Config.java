package ru.blackmirrror.pra_13;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.blackmirrror.pra_13")
@PropertySource("classpath:application.properties")
public class Config {
}
