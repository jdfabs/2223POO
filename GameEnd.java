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
    public GameEnd()
    {
        
            Actor text1 = new Text();
            addObject(text1, getWidth()/2,getHeight()/2);
            text1.setImage(new GreenfootImage("DERROTA", 50, Color.RED, null));
            addObject(new ReturnButton(), getWidth()-100, getHeight()-100);
        
    }
    public GameEnd(int time)
    {
        addObject(new ReturnButton(),getWidth()-100,getHeight()-100);
        addObject(new ReturnButton(),getWidth()-300,getHeight()-100);
            Actor text1 = new Text();
            addObject(text1, getWidth()/2,getHeight()/2-100);
            text1.setImage(new GreenfootImage("Parabéns! Conseguiram escapar", 50, Color.WHITE, null));
            
            Text text2 = new Text();
            addObject(text2, getWidth()/2,getHeight()/2);
            text2.setImage( new GreenfootImage("Ainda tinham " +time + " segundos restantes!",50, Color.WHITE, null));
        
    }    
}
