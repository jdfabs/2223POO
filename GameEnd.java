import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnd extends Menu
{
    
    /**
     * Constructor for objects of class GameEnd.
     * 
     */
    public GameEnd(int result)
    {
        if(result == 1)
        {
            showText("BOA TONTE, GANHASTES", 512, 300);
        }
        else
        {
            showText("ah seu tonte, PERDESTES", 512, 300);
            showText("Tempo: ", 512, 416);
        }
        
    }
}
