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
    private boolean musicaOn = false;
    
    public MenuInicial()
    {    
        menuInicial = new GreenfootImage("MenuInicial.png");
        menuInicial.scale(1000,1000);
        setBackground(menuInicial);
        
        StartButton play = new StartButton();
        addObject(play, 200, 500);
        
        InfoButton info = new InfoButton();
        addObject(info, 200, 600);
        
        MuteButton mute1 = new MuteButton();
        addObject(mute1
        , getWidth()-950, 50);
    }
}
