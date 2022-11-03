import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Solid
{
    private GreenfootImage doorImg;
    public int openDirection = 0;
    public int openDistance = 0;
    public int closedX;
    public int closedY;
    
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Door()
    {
        doorImg = new GreenfootImage("Door.png");
        
        setImage(doorImg);
    }
    public void act()
    {
    
    }
    public void open(){
        switch(openDirection)
        {
            case 0:
                setLocation(closedX,closedY-32*openDistance);  
                break;
            case 1:
                setLocation(closedX+32*openDistance,closedY);
                break;
            case 2:
                setLocation(closedX,closedY+32*openDistance);
                break;
            case 3:
                setLocation(closedX-32*openDistance,closedY);
                break;
        }        
    }
    public void close(){
        setLocation(closedX,closedY);
    }
    public void setup(int a, int b){
        openDistance = a;        
        openDirection = b;
        System.out.println(b);
        closedX = getX();
        closedY = getY();
    }
}
