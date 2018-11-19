package mdu.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductsDemmoAppWithConstructorInjection
    /*
    * This is the application that will be calling the different objects while spring will be injecting the dependancies*/
{


    public static void main(String[] args)
    {
        // configure the bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mduPracticeApplicationContext.xml");
        //get the correct bean from the container
        Product product = context.getBean("speaker", Product.class);
        //call methods on the bean
        System.out.println(product.displayProductDescription());
        System.out.println(product.getBox());
        //close the context
        context.close();
    }
}
