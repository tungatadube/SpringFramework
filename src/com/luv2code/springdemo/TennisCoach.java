package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("singleton")
public class TennisCoach implements Coach
{
    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

//        public TennisCoach()
//        {
//            System.out.println("Inside the default constructor");
//        }

        // define the setter method for injection

//        @Autowired
//        public void  setFortuneService(FortuneService theFortuneService)
//        {
//            System.out.println("Inside the setter method : setFortuneService()");
//            fortuneService = theFortuneService;
//        }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService)
//    {
//        fortuneService  = theFortuneService;
//    }

    // write the init method
    // annotate it to show that it is a postConstructorMethod()
    @PostConstruct
    public void doMyStartupStuff()  //__init__()
    {
        System.out.println("I am now doing your startup stuff.");
    }

    // write the cleanup method and annotate it to show that it is a cleanup method
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("Now doing your clean-up tasks.");
    }
    @Override
    public String getDailyWorkout()
    {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}

