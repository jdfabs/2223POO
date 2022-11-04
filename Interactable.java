
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interactable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interactable extends Actor
{
    /**
     * Act - do whatever the Interactable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean newPress = true;
    public void act()
    {
        
    }
    public boolean isPlayerTouching(){
        Actor player = getOneIntersectingObject(Player.class);
        if(player != null){
            return true;
        }else  
        return false;
    }
    public void effect(){
        
    }
}
