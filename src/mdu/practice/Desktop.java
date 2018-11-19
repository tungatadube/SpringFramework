package mdu.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Product
{
    //create a dependency to set
    @Autowired
    @Qualifier("desktopBox")
    private Box box;

    @Override
    public String displayProductDescription()
    {
        return "This is a Lenovo Desktop: Model 2345, core i7, 450G SSD harddrive, 3.00 GHz AMD Radeon Procesor";
    }
    @Override
    public String getBox()
    {
        return box.getBoxDimensions();
    }
}
