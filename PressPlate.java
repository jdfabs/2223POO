import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressPlate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressPlate extends Interactable
{
    private GreenfootImage PressPlateImg;
    public Door target[] = new Door[10];
    private boolean triggered = false;
    
    public PressPlate()
    {
        PressPlateImg = new GreenfootImage("PressPlate.png"); 
        getImage().scale(90,90);
        setImage(PressPlateImg);
    }
    public void act()
    {
        trigger();
    }
    private void trigger(){
        if(isPlayerTouching() && !triggered){
            int i = 0;
            for(i=0;i<target.length;i++){
                if(target[i]!=null){
                    target[i].open();
                }                
            }
            triggered = true;
        }
        else if(!isPlayerTouching() && triggered){
            int i = 0;
            for(i=0;i<target.length;i++){
                if(target[i]!=null){
                    target[i].close();
                }                
            }
            triggered = false;
        }
    }
}
