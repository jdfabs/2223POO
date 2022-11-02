import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Stages
{
    public PressPlate pressPlate1 = null;
    public Door door1 = null;
    public Door door2 = null;
    public Lever lever1 = null;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
         addStage();
    }
    private void addStage()
    {
        pressPlate1 = new PressPlate();
        addObject(pressPlate1,500,500);
        
        addObject(new Wall1(),16+4*32,32*8);
        addObject(new Wall1(),16+4*32,32*11);
        
        door1 = new Door();
        door2 = new Door();
        addObject(door1,16+4*32,32*10);
        addObject(door2,16+4*32,32*9);
        door1.setup(2,0);
        door2.setup(2,0);
        
        pressPlate1.target[0] = door1;
        pressPlate1.target[1] = door2;
        
        lever1  = new Lever();
        addObject(lever1, 16+4*32,32*12);
        lever1.setup(0);
        lever1.target[0] = door1;
        lever1.target[1] = door2;
        
        
        
    }

}
