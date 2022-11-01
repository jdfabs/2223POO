import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DynamicObject extends Actor
{
    public int velocidadeVertical = 0;
    /**
     * Act - do whatever the Jogador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        Gravity();
        velocidadeVertical = updateVerticalSpeed(onGround());
        
    }

    public void Gravity(){
        
        if(!onGround() || velocidadeVertical <0){
            setLocation(getX(), getY() + velocidadeVertical);
            
        }
    }
    public boolean onGround(){
        if(getY()>800){
            return true;
        }
        else return false;
    }
    public int updateVerticalSpeed(boolean onGround){
        if (onGround){
            return 0;
        }
        else{
        return velocidadeVertical+1;
        }
        
    }
}
