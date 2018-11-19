package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;

    @Value("${name}")
    private String name;

    public SwimCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return"Practice your Ngqethu boy!";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
