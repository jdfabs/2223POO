import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPText extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HPText(){
        setImage(new GreenfootImage("HP: 3", 24, Color.BLACK, null));

    }
    public void act()
    {
        // Add your action code here.
    }
    public void changeText(int currentHP){
        setImage(new GreenfootImage("HP: " + currentHP, 24, Color.BLACK, null));
    }
}
