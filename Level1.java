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

    public void setupLevel(){
        Actor plataforma = new Floor();
        addObject(plataforma,getWidth()*3/4, 750);
        plataforma.getImage().scale(600,50);
        
        PressurePlate pressurePlate = new PressurePlate();
        addObject(pressurePlate, getWidth()/2, 570);       
        
        Door door = new Door();
        addObject(door, getWidth()/2, 825);
        pressurePlate.setTarget(door);
        
        for(int i=0; i < 5; i++){
            addObject(new Spikes(), 50+ 30*i, 860);
        }
    }
}
