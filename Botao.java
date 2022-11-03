import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botao extends Actor
{   
    public String keyBind = null;    
    public int keyBindTimer = 0;
    /**
     * Act - do whatever the Botao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        wasClickedCheck();
        if(keyBind != null){
            keyBindCheck();
        }
        
    }
    public void wasClickedCheck(){
        if(Greenfoot.mouseClicked(this)){
            clicked();
        }
    }
    public void clicked(){
        System.out.println(getClass().getName() + " buttom was clicked");
    }
    public void keyBindCheck()
    {
        if(Greenfoot.isKeyDown(keyBind) && keyBindTimer == 0 )
        {
            
            clicked();
            keyBindTimer = 30;
        }
        if(keyBindTimer > 0) {
            keyBindTimer--;
        }
    }
}
