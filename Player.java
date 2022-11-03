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
    public int hp = 3;
    public boolean damageReady= true;
    public int damageCooldown = 0;
    public HPText hpText =  null;
    
    public Player(){
        
    }
       
    public void act()
    {        
        super.act();
        movimento(); 
        loseHP(); 
        checkGameLoss();
    }
    public void movimento(){
        if(Greenfoot.isKeyDown(left) && isWalkable("left")){
            setLocation(getX()-3,getY());
            
        }
        if(Greenfoot.isKeyDown(right) && isWalkable("right")){
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown(up) && isWalkable("up")){
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown(down) && isWalkable("down")){
            setLocation(getX(),getY()+3);
        }
    }
    public void checkGameLoss(){
        if(hp == 0){
            Greenfoot.setWorld(new GameEnd());
        }
    }

    public void setup(String upKey, String leftKey, String rightKey, String downKey, HPText text){        
            up = upKey;
            left = leftKey; 
            right = rightKey;
            down = downKey;
            hpText = text;            
    }
    public void loseHP(){
        Actor spike = getOneIntersectingObject(Spike.class);
        Actor bala = getOneIntersectingObject(Bala.class);
        
        if(damageCooldown > 0){
            damageCooldown--;
            
        }
        else if(damageCooldown == 0){
            damageReady = true;
        }        
        if(damageReady && (spike != null || bala != null)){
            hp--;
            
            hpText.changeText(hp);
            damageReady = false;
            damageCooldown = 120;
        }        
    }

}
