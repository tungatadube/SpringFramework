package mdu.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DesktopBox implements Box
    /*
    * This class yields the dimensions for the desktop Box
    *
    * */
{
    @Override
    public String getBoxDimensions()
    {
        return "Desktop Box: size 230 x 340 x 650";
    }
}
