import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DynamicObject extends Actor
{
    
    public boolean isWalkable(String direction){
        Actor wall = null;
        
        switch(direction){
            case "up":
                wall = getOneObjectAtOffset(0, -16, Solid.class);
                
                break;
            case "right":
                wall = getOneObjectAtOffset(16, 0, Solid.class);
                
                break;
            case "down":
                wall = getOneObjectAtOffset(0, 16, Solid.class);
                
                break;
            case "left":
                wall = getOneObjectAtOffset(-16, 0, Solid.class);
                
                break;
        }      
        
        if(wall == null)
        {
            return true;
        }
        else
        {
            
            return false;
        }             
    }
    
}

