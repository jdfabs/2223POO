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
        menuInicial = new GreenfootImage("MenuInicial.jpeg");
        menuInicial.scale(1000,1000);
        setBackground(menuInicial);
        
        StartButton play = new StartButton();
        addObject(play, 534, 300);
        
        InfoButton info = new InfoButton();
        addObject(info, 534, 400);
    }
}
