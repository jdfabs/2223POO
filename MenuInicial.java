import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInicial extends Menu
{
    private GreenfootImage menuInicial;
    private GreenfootSound som;
    /**
     * Constructor for objects of class MenuInicial.
     * 
     */
    public MenuInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1000, 900, 1);
        
        menuInicial = new GreenfootImage("MenuInicial.jpeg");
        menuInicial.scale(1000,1000);
        setBackground(menuInicial);
        
        StartButton play = new StartButton();
        addObject(play, 534, 300);
        
        InfoButton info = new InfoButton();
        addObject(info, 534, 400);
        
        MuteButton mute = new MuteButton();
        addObject(mute, getWidth()-950, 50);
        
        som = new GreenfootSound("Som.mp3");
        //som.playLoop();
        
    }
    public GreenfootSound somFundo()
    {
        return som;
    }
}
