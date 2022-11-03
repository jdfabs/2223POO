import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saida extends Interactable
{
    private int playersTouching = 0;

    public void act()
    {
        trigger();
        win();
    }
    private void trigger(){
        if(isPlayerTouching()){
            getWorld().removeObject(getOneIntersectingObject(Player.class));
            playersTouching++;
        }
        
    }
    private void win(){
        if(playersTouching==2){
            //WIN
        }
    }
}
