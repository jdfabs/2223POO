import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends DynamicObject
{
    public int direcao;
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bala(int dir){
        direcao = dir;
    }
    public void act()
    {
        movimentoBala(direcao);
        removeBala();
        System.out.println("direçao: " + direcao);
    }
    public void removeBala()
    {
        if(isTouching(Solid.class) && !isTouching(Cannon.class))
        getWorld().removeObject(this);
    }
    public void movimentoBala(int direcao)
    {
        switch(direcao){
            case 0:
                setLocation(getX(), getY() - 5);
                break;
            case 1:
                setLocation(getX() + 5, getY());
                break;
            case 2:
                setLocation(getX(), getY() +5);
                break;
            case 3:
                setLocation(getX() - 5, getY() );
                break;
        }
    }
}
