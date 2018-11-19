package mdu.practice;

import org.springframework.stereotype.Component;

@Component
public class LaptopBox implements Box
    /*
    * This class will responsible for creating laptop boxes
    * */
{
    @Override
    public String getBoxDimensions()
    {
        return "Laptop Box size: 50cm x 230cm X 100cm";
    }
}
