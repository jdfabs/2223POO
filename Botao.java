import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botao extends Actor
{
    /**
     * Act - do whatever the Botao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        wasClickedCheck();
    }
    public void wasClickedCheck(){
        if(Greenfoot.mouseClicked(this)){
            clicked();
        }
    }
    public void clicked(){
        System.out.println(getClass().getName() + " buttom was clicked");
    }
}
