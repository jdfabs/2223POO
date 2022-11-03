import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever extends Interactable
{
    private GreenfootImage LeverImg;
    private int direction = 0;
    public Door target[] = new Door[10];
    private boolean triggered = false;
    private boolean newTouch = true;
    
    public Lever()
    {
        LeverImg = new GreenfootImage("Button.png");        
        setImage(LeverImg);
    }
    public void act()
    {
        trigger();
    }
    public void setup(int dir){
        direction = dir;
        switch(dir){
            case 0:
                setLocation(getX(),getY()-15);
                break;
            case 1:
                setLocation(getX()+15,getY());
                setRotation(90);
                break;
            case 2:
                setLocation(getX(),getY()+15);
                break;
            case 3:
                setLocation(getX()-15,getY());
                setRotation(90);
                break;
        }
    }
    private void trigger(){
        if(isPlayerTouching() && newTouch && triggered){
            int i = 0;
            for(i=0;i<target.length;i++){
                if(target[i]!=null){
                    target[i].close();
                }                
            }
            System.out.println("Door is now closed");
            triggered = false;
            newTouch = false;
        }
        else if(isPlayerTouching() && newTouch && !triggered){
            int i = 0;
            for(i=0;i<target.length;i++){
                if(target[i]!=null){
                    target[i].open();
                }                
            }
            System.out.println("Door is now Open");
            triggered = true;
            newTouch = false;
        }
        else if (!isPlayerTouching() && !newTouch ){
            newTouch=true;
        }
    }
}
