package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{
    @Override
    public String getFortune()
    {
        return "Work on your relationship with the Almighty";
    }
}