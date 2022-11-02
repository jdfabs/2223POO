import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DynamicObject extends Actor
{
    public void act()
    {        
              
    }
    
    public boolean isWalkable(String direction){
        Actor wall = null;
        
        switch(direction){
            case "up":
                wall = getOneObjectAtOffset(0, -16, Solid.class);
                System.out.println(0);
                break;
            case "right":
                wall = getOneObjectAtOffset(16, 0, Solid.class);
                System.out.println(1);
                break;
            case "down":
                wall = getOneObjectAtOffset(0, 16, Solid.class);
                System.out.println(2);
                break;
            case "left":
                wall = getOneObjectAtOffset(-16, 0, Solid.class);
                System.out.println(3);
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

