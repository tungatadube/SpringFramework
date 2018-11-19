package mdu.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Product
{
//    // include a Box filed
//    @Autowired
//    @Qualifier("laptopBox")


    private Box box;
// Use constructor injection instead
    @Autowired
    public Laptop(@Qualifier("laptopBox") Box theBox)
    {
        box = theBox;
    }


    @Override
    public String displayProductDescription()
    {
        return "This is a Lenovo laptop: Model T530, Core i5, 500G HDD, 2.90GHZ Radeon AMD processor.";
    }

    @Override
    public String getBox()
    {
        return box.getBoxDimensions();
    }
}
