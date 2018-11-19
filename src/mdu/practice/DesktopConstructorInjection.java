package mdu.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DesktopConstructorInjection implements Product

{
    private Box box;

    //create the constructor to set the dependency
    //Autowire this dependecy (which is a box in this instance
    @Autowired
    public DesktopConstructorInjection(@Qualifier("desktopBox") Box theBox)
    {
        box = theBox;
    }

    @Override
    public String displayProductDescription()
    {
        return "This is a Lenovo Desktop: Model 2345, core i7, 450G SSD hard drive, 3.00 GHz AMD Radeon Procesor";
    }
    @Override
    public String getBox()
    {
        return box.getBoxDimensions();
    }
}
