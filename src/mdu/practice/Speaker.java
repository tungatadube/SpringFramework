package mdu.practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Speaker implements Product
{
//    //include a dependency field
//    @Autowired
//    @Qualifier("speakerBox")

    private Box box;

    // Use setter injection instead to configure the dependency
    @Autowired
    public void setBox(@Qualifier("speakerBox") Box theBox)
    {
        box = theBox;
    }
    @Override
    public String displayProductDescription()
    {
        return "These are bluetooth Speakers: Manufacturer: Zhuangtu pvt Ltd, 2W output with twitter.";
    }
    @Override
    public String getBox()
    {
        return box.getBoxDimensions();
    }
}
