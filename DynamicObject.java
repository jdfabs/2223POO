import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DynamicObject extends Actor
{
    /*public int velocidadeVertical = 0;
    /**
     * Act - do whatever the Jogador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
    public void act()
    {        
        Gravity();
        velocidadeVertical = updateVerticalSpeed(onGround());        
    }

    public void Gravity(){
        
        if(!onGround() || velocidadeVertical <0){
            setLocation(getX(), getY() + velocidadeVertical);
            
        }
        if(onGround()){
            setLocation(getX(),getOneIntersectingObject(Floor.class).getY()-50);
        }
        if(isTouchingCelling()){
            setLocation(getX(),getOneIntersectingObject(Floor.class).getY()+55);
        }
    }
    public boolean onGround(){
        Actor a = getOneIntersectingObject(Floor.class);
        if(a != null && a.getY()>getY()){
            return true;
        }
        else return false;
    }
    public int isTouchingWall(){
        Actor  a = getOneIntersectingObject(Wall.class);              
        //á direita
        if(a != null && a.getX()>getX()){
            return 1;
        }
        //á esquerda
        if(a != null && a.getX()<getX()){
            return 2;
        }
        return 0;
    }
    public boolean isTouchingCelling(){
        Actor a = getOneIntersectingObject(Floor.class);
        if(a != null && a.getY()<getY()){
            velocidadeVertical = 0;
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
    public int isTouchingPlayer()
    {
        Actor a = getOneIntersectingObject(Player.class);
        return 1;
    }*/
}

