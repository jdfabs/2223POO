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
    private double time;
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
        time = 60;
        showText("Time left: " + time, 150,150);
        time = time - ((System.currentTimeMillis() - initTime) / 1000);
    }
}
