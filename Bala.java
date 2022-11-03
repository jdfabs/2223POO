import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends DynamicObject
{
    private GreenfootImage balaImg;
    private int direcao;
    
    public Bala(int dir){
        balaImg = new GreenfootImage("brick.png");        
        setImage(balaImg);
        getImage().scale(20,20);
        direcao = dir;
        switch(dir){
            case 0:
                setRotation(90);
                break;
            case 1:
                setRotation(-180);
                break;
            case 2:
                setRotation(90);
                break;
            case 3:
                setRotation(0);
                break;
        
        }
    }
    public void act()
    {
        movimentoBala(direcao);
        removeBala();
        
    }
    private void removeBala()
    {
        if(isTouching(Solid.class) && !isTouching(Cannon.class))
        getWorld().removeObject(this);
    }
    private void movimentoBala(int direcao)
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
