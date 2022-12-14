import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Solid
{
    private GreenfootImage cannonImg;
    private int dispara = 0;
    private int direcao;
    private int shootingSpeed;
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cannon(int dir, int speed){    
        cannonImg = new GreenfootImage("dropper_front.png");        
        setImage(cannonImg);
        shootingSpeed = speed;
        switch(dir){
            case 0:
                setRotation(180);
                break;
            case 1:
                setRotation(-90);
                break;
            case 2:
                break;
            case 3:
                setRotation(90);
                break;
        }
        
        direcao = dir;
    }
    public void act()
    {
        disparar();
    }
    private void disparar()
    {
        dispara++;
        if(dispara + Greenfoot.getRandomNumber(500) >= shootingSpeed)
        {
            Bala bala1 = new Bala(direcao);
            getWorld().addObject(bala1, getX(), getY());
            dispara = 0;
        }        
    }
}
