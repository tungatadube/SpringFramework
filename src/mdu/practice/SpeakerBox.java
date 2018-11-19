package mdu.practice;

import org.springframework.stereotype.Component;

@Component
public class SpeakerBox implements Box
    /*
    * This class will give the dimensions for the speaker box
    * */
{
    @Override
    public String getBoxDimensions()
    {
        return "The Box for the speaker: size; 30cm x 23cm x 17 cm";
    }
}
