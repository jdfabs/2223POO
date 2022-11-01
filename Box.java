import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends DynamicObject
{   
    private Box box;
    public String action;
    public Player pick1;
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
    }
    public void pickObject()
    {
        if(box== null && Greenfoot.isKeyDown(action) && isTouchingPlayer() == 1)
        {
            box = (Box) getObjectsInRange(25, Box.class).get(0);
            //setLocation(Player.getX(),Player.getY());
        }
        if(box != null && Greenfoot.isKeyDown(action))
        {
            box = null;
        }
    }
}
