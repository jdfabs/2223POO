import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes extends Interactable
{
    /**
     * Act - do whatever the Spikes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img;
    
    public Spikes()
    {
        img = new GreenfootImage("Spike.jfif");
        img.scale(30,30);
        setImage(img);
    }

    public void effect(){
        System.out.println("001");
        getWorld().removeObject(getOneIntersectingObject(Player.class));
        Greenfoot.setWorld(new Level1());            
    }    
}
