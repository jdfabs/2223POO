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
    int saltoTimer = 0;
    
    int velocidadeHorizontal = 0;
    int velocidadeMax = 8;
    int forcaSalto = 25;    
    public void act()
    {        
        super.act();
        movimento();   
        
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
    
        
        if(Greenfoot.isKeyDown(up) && onGround() && velocidadeVertical >= 0  && saltoTimer == 0){
            velocidadeVertical -= forcaSalto;
            saltoTimer = 10;
        }
        if(saltoTimer > 0 && onGround()) {
            saltoTimer--;
        }
    }

    public void atrito(){
        if(onGround()){
            velocidadeHorizontal = velocidadeHorizontal*30/31 ;
        }        
    }
    public void setup(String upKey, String leftKey, String rightKey, String downKey){        
            up = upKey;
            left = leftKey; 
            right = rightKey;
            down = downKey;       
    }
    
}
