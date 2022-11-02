import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Solid
{
    private int dispara = 0;
    public int direcao;
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cannon(int dir){
    
        direcao = dir;
    }
    public void act()
    {
        disparar();
    }
    public void disparar()
    {
        dispara++;
        if(dispara + Greenfoot.getRandomNumber(100) >= 300)
        {
            Bala bala1 = new Bala(direcao);
            getWorld().addObject(bala1, getX(), getY());
            dispara = 0;
        }        
    }
}
