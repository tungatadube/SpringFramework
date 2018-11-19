package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sportsfile")
public class SportConfig
{

    // define the bean for the fortune service
    @Bean
    public FortuneService databaseFortuneService()
    {
        return new DatabaseFortuneService();
    }
    // define bean for the swimCoach and inject the dependency.

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(databaseFortuneService());
    }

    // inject the dependency
}
