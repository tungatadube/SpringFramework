package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemmoWithAnnotations
{
    public static void main(String[] args)
    {
        // configure the bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
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
