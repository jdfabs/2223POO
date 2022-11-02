import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends StaticObject
{
    private GreenfootImage doorImg;
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Door()
    {
        doorImg = new GreenfootImage("Door.png");
        
        setImage(doorImg);
    }
    public void act()
    {
        // Add your action code here.
    }
}
