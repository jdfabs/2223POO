import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuStart extends Menu
{
    private GreenfootImage menuInicial;
    private GreenfootSound som;    
    private boolean musicaOn = false;
    
    public MenuStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1000, 900, 1);
        
        menuInicial = new GreenfootImage("MenuInicial.jpeg");
        menuInicial.scale(1000,1000);
        setBackground(menuInicial);
        
        MuteButton mute = new MuteButton();
        addObject(mute, getWidth()-950, 50);
        
        som = new GreenfootSound("Som.mp3");
        
            som.playLoop();
            som.setVolume(10);    
        Actor text = new Text();
        addObject(text,getWidth()/2,getHeight()/2);
        text.setImage(new GreenfootImage("Press ENTER to Start", 50, Color.WHITE, null));

    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MenuInicial());
            
        }
    }
    public GreenfootSound somFundo()
    {
        return som;
    }
}
