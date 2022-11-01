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
        Player player1 = new Player();
        Player player2 = new Player();
        
        addObject(player1, 200, 300);
        player1.setup("w", "a", "d", "s");
        addObject(player2, 800, 300);
        player2.setup("up", "left", "right", "down");
    
    }
}
