import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Stages
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        Actor floor = new Floor();
        addObject(floor,getWidth()/2, 900);
        floor.getImage().scale(1000,50);

        Actor wallLeft = new Wall();
        addObject(wallLeft,0, getHeight()/2);
        wallLeft.getImage().scale(50,1000);
        
        Actor wallRight = new Wall();
        addObject(wallRight,1000, getHeight()/2);
        wallRight.getImage().scale(50,1000);
        
        
        Player player1 = new Player();
        Player player2 = new Player();
        
        addObject(player1, 200, 300);
        player1.setup("w", "a", "d", "s");
        addObject(player2, 800, 300);
        player2.setup("up", "left", "right", "down");
        
    
    }
}
