import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends DynamicObject
{
    public String  up = "w", down = "s", left = "a", right = "d" ;
    
       
    public void act()
    {        
        super.act();
        movimento();   
        
    }
    public void movimento(){
        if(Greenfoot.isKeyDown(left) && isWalkable("left")){
            setLocation(getX()-3,getY());
            //System.out.println("left");
        }
        if(Greenfoot.isKeyDown(right) && isWalkable("right")){
            setLocation(getX()+3,getY());
            //System.out.println("right");
        }
        if(Greenfoot.isKeyDown(up) && isWalkable("up")){
            setLocation(getX(),getY()-3);
            //System.out.println("up");
        }
        if(Greenfoot.isKeyDown(down) && isWalkable("down")){
            setLocation(getX(),getY()+3);
            //System.out.println("down");
        }
    }

    public void setup(String upKey, String leftKey, String rightKey, String downKey){        
            up = upKey;
            left = leftKey; 
            right = rightKey;
            down = downKey;       
    }
    
}
