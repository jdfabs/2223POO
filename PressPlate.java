import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressPlate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressPlate extends Interactable
{
    private GreenfootImage PressPlateImg;
    public PressPlate()
    {
        PressPlateImg = new GreenfootImage("stone.png"); 
        getImage().scale(90,90);
        setImage(PressPlateImg);
    }
}
