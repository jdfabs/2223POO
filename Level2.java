import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Stages
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2(int time)
    {
         addStage();
         timer.timeLeft = time;
         timer.updateTimer();
    }
    private void addStage()
    {
        
    }
}
