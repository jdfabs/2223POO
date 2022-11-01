import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoButton extends Actor
{
    private GreenfootImage info;
    //Construtor do botão de info
    public InfoButton()
    {
        info = new GreenfootImage("HelpButton.png");
        info.scale(100,100);
        setImage(info);
    }
    /**
     * Act - do whatever the infoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        help();
    }
    public void help()
    {
        if(Greenfoot.mouseClicked(this))
    {
            Greenfoot.setWorld(new MenuInfo());
        }
    }
}
