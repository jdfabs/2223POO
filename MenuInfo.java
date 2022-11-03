import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInfo extends Menu
{
    private GreenfootImage fundo;
    /**
     * Constructor for objects of class MenuInfo.
     * 
     */
    public MenuInfo()
    {                    
        fundo = new GreenfootImage("MenuInfo.png");
        fundo.scale(1024,832);
        setBackground(fundo);
        
        MuteButton mute = new MuteButton();
        addObject(mute, getWidth()-950, 50);
        
        ReturnButton volta = new ReturnButton();
        addObject(volta, getWidth()-50,getHeight()-50);
        
        
        
        
        
    }
}
