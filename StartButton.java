import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    private GreenfootImage start;
    //Construtor do botão de start  
    public StartButton()
    {
        start = new GreenfootImage("StartButton.png");
        start.scale(100,100);
        setImage(start);
    }
    
    
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        start();
    }
    public void start()
    {
        if(Greenfoot.mouseClicked(this))
        {
            //
        }
    }
}
