import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Wall
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isOpen = false;
    public boolean wasOpen = false;
    public int diferencaAberto = 100;
    public Door(){
        getImage().scale(50,100);
    }
    public void act()
    {
        // Add your action code here.
    }
    public void open(){
        if(isOpen){
            setLocation(getX(),getY()+diferencaAberto);
            isOpen=false;
        }
        else if (!isOpen){
            setLocation(getX(),getY()-diferencaAberto);
            isOpen=true;
        }
    }
}
