import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{
    private double initTime = System.currentTimeMillis();
    public int time = 60;
    public int timer = 3600;
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Stages()
    {
        super(1000, 900, 1); 
    }
    public void timer()
    {
        showText("Time left: " + time, 50,50);
        timer--;
        if (timer % 55 == 0)
            {
                time--;
            }
        //time - ((System.currentTimeMillis() - initTime) / 1000);
    }
}
