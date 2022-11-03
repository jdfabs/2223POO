import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saida extends Interactable
{
    public int playersTouching = 0;
    /**
     * Act - do whatever the Saida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        trigger();
        win();
    }
    public void trigger(){
        if(isPlayerTouching()){
            getWorld().removeObject(getOneIntersectingObject(Player.class));
            playersTouching++;
        }
        
    }
    public void win(){
        if(playersTouching==2){
            //WIN
        }
    }
}
