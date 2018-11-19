package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp
{
    public static void main(String[] args)
    {
        // configure the bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // get the bean from the Spring container
        Coach theCouch = context.getBean("tennisCoach", Coach.class);
        //call methods on the bean
        System.out.println(theCouch.getDailyWorkout());
        //call new methods on this bean
        System.out.println(theCouch.getDailyFortune());
        // close the context
        context.close();
    }
}
