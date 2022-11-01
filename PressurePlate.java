import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressurePlate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressurePlate extends Interactable
{
    /**
     * Act - do whatever the PressurePlate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Door target;
    
    public PressurePlate()
    {        
        getImage().scale(70,10);
    }

    public void effect(){
        System.out.println("Pressure plate being pressed"); 
        target.open();
    }
    public void setTarget(Door object){
        target = object;
        
    }
}
