import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPText extends Actor
{
    public int playerNum = 0;
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HPText(){
        setImage(new GreenfootImage("Player "+playerNum+" HP: 3", 24, Color.RED, null));

    }
    public void act()
    {
        // Add your action code here.
    }
    public void changeText(int currentHP){
        setImage(new GreenfootImage("Player "+playerNum+" HP: " + currentHP, 24, Color.RED, null));
    }
}
