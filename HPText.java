import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPText extends Actor
{
    private int playerNum = 0;
    public HPText(){
        setImage(new GreenfootImage("Player "+playerNum+" HP: 3", 24, Color.WHITE, null));

    }
    public void changeText(int currentHP){
        setImage(new GreenfootImage("Player "+playerNum+" HP: " + currentHP, 24, Color.WHITE, null));
    }
    public void setPlayerNum(int num){
        playerNum = num;
        
    }
}
