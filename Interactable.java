
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interactable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interactable extends StaticObject
{
    /**
     * Act - do whatever the Interactable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean newPress = true;
    public void act()
    {
        isPlayerTouching();
    }
    public void isPlayerTouching(){
        Actor player = getOneIntersectingObject(Player.class);
        if(player != null && newPress == true){
            newPress = false;
            effect();
        }
        else if (player == null && newPress==false){
            newPress = true;
        }
        return;
    }
    public void effect(){
        
    }
}
