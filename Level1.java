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
    public PressPlate pressPlate2 = null;
    public PressPlate pressPlate3 = null;
    public Door door1 = null;
    public Door door2 = null;
    public Door door3 = null;
    public Door door4 = null;
    public Door door5 = null;
    public Door door6 = null;
    public Door door7 = null;
    public Door door8 = null;
    public Lever lever1 = null;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
         addStage();
         timer();
    }
    public void act()
    {
        timer();
    }
    private void addStage()
    {
        //addObject(new Wall1(),16+4*32,32*11);
        player1.setLocation(32*27+16,32*23+16);
        player2.setLocation(32*15+16,32*23+16);
        
        int i = 0;
        
        spawnRow("Wall1",21, 21,1, 10);
        spawnRow("Wall1",21, 17,1, 10);    
 
        
        pressPlate1 = new PressPlate();
        addObject(pressPlate1,32*29+16,32*23+16);
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        addObject(door1,16+22*32,32*18 +16);
        addObject(door2,16+22*32,32*19+16);
        addObject(door3,16+22*32,32*20+16);
        door1.setup(3,0);
        door2.setup(3,0);
        door3.setup(3,0);
        pressPlate1.target[0] = door1;
        pressPlate1.target[1] = door2;
        pressPlate1.target[2] = door3;
        
        
        lever1  = new Lever();
        addObject(lever1,32*30+16,32*19+16);
        lever1.setup(1);
        lever1.target[0] = door1;
        lever1.target[1] = door2;
        
        door4 = new Door();
        door5 = new Door();
        door6 = new Door();
        addObject(door4,16+22*32,32*22 +16);
        addObject(door5,16+22*32,32*23+16);
        addObject(door6,16+22*32,32*24+16);
        door4.setup(3,2);
        door5.setup(3,2);
        door6.setup(3,2);
        lever1.target[0] = door4;
        lever1.target[1] = door5;
        lever1.target[2] = door6;
        
        
        
        spawnRow("Spike",18, 19,2, 6);
        spawnRow("Wall1",12, 14,2, 11);
        spawnRow("Wall1",12, 13,1, 9);
        for( i = 0; i < 3; i++){
            addObject(new Cannon(2),16+(21+i*3)*32 ,32*13+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Wall1(),16+(22+i*3)*32 ,32*13+16);
            addObject(new Wall1(),16+(23+i*3)*32 ,32*13+16);
        }
        addObject(new Cannon(2),16+30*32 ,32*0+16);
        addObject(new Cannon(2),16+29*32 ,32*0+16);
        addObject(new Cannon(2),16+28*32 ,32*0+16);
        spawnRow("Wall1",27, 4,2, 7);
        spawnRow("Wall1",25, 4,1, 2);
        spawnRow("Wall1",24, 1,2, 4);       

        
        pressPlate2 = new PressPlate();
        pressPlate3 = new PressPlate();
        addObject(pressPlate2,32*26+16,32*2+16);
        addObject(pressPlate3,32*21+16,32*2+16);
        door7 = new Door();
        door8 = new Door();        
        addObject(door7,16+27*32,32*11+16);
        addObject(door8,16+27*32,32*12+16);        
        door7.setup(2,0);
        door8.setup(2,0);        
        pressPlate2.target[0] = door7;
        pressPlate2.target[1] = door8;
        pressPlate3.target[0] = door7;
        pressPlate3.target[1] = door8;
        for( i = 0; i < 6; i++){
            addObject(new Spike(),16+26*32 ,32*(5+i)+16);
        }
        for( i = 0; i < 4; i++){
            addObject(new Spike(),16+23*32 ,32*(1+i)+16);
        }
        for( i = 0; i < 8; i++){
            addObject(new Spike(),16+19*32 ,32*(1+i)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Spike(),16+23*32 ,32*(8+i)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Wall1(),16+22*32 ,32*(8+i)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Wall1(),16+(19+i)*32 ,32*9+16);
        }
        for( i = 0; i < 9; i++){
            addObject(new Wall1(),16+18*32 ,32*(1+i)+16);
        }
        for( i = 0; i < 4; i++){
            addObject(new Spike(),16+(20+i)*32 ,32*8+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Spike(),16+(23+i)*32 ,32*5+16);
        }
        
        spawnRow("Wall1",5, 3,2, 4);
        
    }

}
