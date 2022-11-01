import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInfo extends World
{
    private GreenfootImage fundo;
    /**
     * Constructor for objects of class MenuInfo.
     * 
     */
    public MenuInfo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        
        fundo = new GreenfootImage("MenuInfo.jfif");
        fundo.scale(1000,1000);
        setBackground(fundo);
        
        MuteButton mute = new MuteButton();
        addObject(mute, getWidth()-950, 50);
        
        ReturnButton volta = new ReturnButton();
        addObject(volta, getWidth()-50,getHeight()-50);
        
        
        
    }
}
