import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Interactable
{
    private GreenfootImage spikeImg;
    
    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spike(){
        spikeImg = new GreenfootImage("Spike.png");        
        setImage(spikeImg);
    }
}
