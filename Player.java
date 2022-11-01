import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends DynamicObject
{
    public String  up = "w", down = "s", left = "a", right = "d", action = "f" ;
    
    
    int velocidadeHorizontal = 0;
    int merda;
    int velocidadeMax = 10;
    int forcaSalto = 25;    
    public void act()
    {        
        super.act();
        movimento();
        //pickObject();
        
        
    }
    public void movimento(){
        atrito();
        setLocation(getX()+velocidadeHorizontal,getY());
        if(Greenfoot.isKeyDown(left) && velocidadeHorizontal > -velocidadeMax && isTouchingWall() != 2){
            if(onGround()){
                velocidadeHorizontal -= 2;
            }
            else{
                velocidadeHorizontal -= 1;
            }            
        }
        if(Greenfoot.isKeyDown(right)&& velocidadeHorizontal < velocidadeMax && isTouchingWall() != 1){
            if(onGround()){
                velocidadeHorizontal += 2;
            }
            else{
                velocidadeHorizontal += 1;
            }
        }
        if(velocidadeHorizontal < 0 && isTouchingWall() == 2 ){
            setLocation(getOneIntersectingObject(Wall.class).getX()+50,getY());
            velocidadeHorizontal = 0;
        }
        if(velocidadeHorizontal > 0 && isTouchingWall() == 1 ){
            setLocation(getOneIntersectingObject(Wall.class).getX()-50,getY());
            velocidadeHorizontal = 0;
        }
        
        
        if(Greenfoot.isKeyDown(up)){
            if(onGround()){
            velocidadeVertical -= forcaSalto;
            }
        }
        
    }

    public void atrito(){
        if(onGround()){
            velocidadeHorizontal = velocidadeHorizontal*30/31 ;
        }        
    }
    public void setup(String upKey, String leftKey, String rightKey, String downKey, String actionKey){        
            up = upKey;
            left = leftKey; 
            right = rightKey;
            down = downKey; 
            action = actionKey;
    }
    /*public void pickObject()
    {
        if(box== null && Greenfoot.isKeyDown(action) && isTouchingBox() == 1)
        {
            box = (Box) getObjectsInRange(25, Box.class).get(0);
            setLocation(300,450);
        }
        if(box != null && Greenfoot.isKeyDown(action))
        {
            box = null;
        }
    }*/
}
