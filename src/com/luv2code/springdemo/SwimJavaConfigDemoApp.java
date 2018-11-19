package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp
{
    public static void main(String[] args)
    {
        // load the config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve the bean from the spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        SwimCoach theAlphaCoach = context.getBean("swimCoach", SwimCoach.class);

        //check if these two are the same

        String result = (theCoach == theAlphaCoach)? "Yes there are the same: see\n" + theCoach + " and "
                + theAlphaCoach + ".":"No there are not the same: see\n" + theCoach + " and "
                + theAlphaCoach + ".";

        System.out.println(result);
        System.out.println(theAlphaCoach.getDailyFortune());
        System.out.println("Email\n" + theAlphaCoach.getEmail());
        System.out.println("Name\n" + theCoach.getName());
        System.out.println(theAlphaCoach.getDailyWorkout());


        // close the context
        context.close();


    }
}
