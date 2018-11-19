package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "You will do well if you code everyday courtesy of the database service.";
    }
}
