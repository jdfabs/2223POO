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
    public PressPlate pressPlate4 = null;
    public PressPlate pressPlate5 = null;
    public Door door1 = null;
    public Door door2 = null;
    public Door door3 = null;
    public Door door4 = null;
    public Door door5 = null;
    public Door door6 = null;
    public Door door7 = null;
    public Door door8 = null;
    public Door door9 = null;
    public Door door10 = null;
    public Door door11 = null;
    public Door door12 = null;
    public Door door13 = null;
    public Door door14 = null;
    public Door door15 = null;
    public Door door16 = null;
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
        spawnRow("Spike",18, 19,2, 6);
        spawnRow("Wall1",12, 14,2, 11);
        spawnRow("Wall1",12, 13,1, 9);
        spawnRow("Wall1",27, 4,2, 7);
        spawnRow("Wall1",25, 4,1, 2);
        spawnRow("Wall1",24, 1,2, 4);
        spawnRow("Spike",26, 5,2, 6);   
        spawnRow("Spike",23, 1,2, 4); 
        spawnRow("Spike",19, 1,2, 8);   
        spawnRow("Spike",23, 8,2, 3);
        spawnRow("Wall1",22, 8,2, 3);
        spawnRow("Wall1",21, 9,3, 3); 
        spawnRow("Wall1",18, 1,2, 9);
        spawnRow("Spike",20, 8,1, 3);
        spawnRow("Spike",23, 5,1, 3);
 
        
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
        


        
        spawnRow("Wall1",12, 5,2, 8);        
        spawnRow("Wall1",15, 9,0, 8);
        
        
        pressPlate4 = new PressPlate();
        pressPlate5 = new PressPlate();
        addObject(pressPlate4,32*13+16,32*7+16);
        addObject(pressPlate5,32*17+16,32*3+16);
        door9 = new Door();
        door10 = new Door();
        door11 = new Door();
        door12 = new Door(); 
        door13 = new Door();
        door14 = new Door();
        door15 = new Door();
        door16 = new Door(); 
        addObject(door9,16+13*32,32*5+16);
        addObject(door10,16+14*32,32*5+16); 
        addObject(door11,16+18*32,32*5+16);
        addObject(door12,16+19*32,32*5+16);
        
        addObject(door13,16+11*32,32*9+16);
        addObject(door14,16+12*32,32*9+16); 
        addObject(door15,16+16*32,32*9+16);
        addObject(door16,16+17*32,32*9+16); 
        door9.setup(2,3);
        door10.setup(2,3);
        door11.setup(2,3);
        door12.setup(2,3);
        door13.setup(2,1);
        door14.setup(2,1);
        door15.setup(2,1);
        door16.setup(2,1);
        door9.setRotation(90);
        door10.setRotation(90);
        door11.setRotation(90);
        door12.setRotation(90);
        door13.setRotation(90);
        door14.setRotation(90);
        door15.setRotation(90);
        door16.setRotation(90);
        
        
        pressPlate4.target[0] = door13;
        pressPlate4.target[1] = door14;
        pressPlate5.target[0] = door10;
        pressPlate5.target[1] = door9;
        
        pressPlate4.target[2] = door15;
        pressPlate4.target[3] = door16;
        
        pressPlate4.target[4] = door11;
        pressPlate4.target[5] = door12;
        
        
        
        spawnRow("Wall1",8, 2,1, 7);
        spawnRow("Wall1",8, 3,2, 18);
        spawnRow("Wall1",4, 1,2, 20);
        addObject(new Spike(),16+5*32,32*3+16);
        addObject(new Spike(),16+7*32,32*6+16);
        addObject(new Spike(),16+5*32,32*9+16);
        addObject(new Spike(),16+7*32,32*12+16);
        addObject(new Spike(),16+5*32,32*14+16);
        addObject(new Spike(),16+7*32,32*16+16);
        addObject(new Spike(),16+5*32,32*18+16);
        addObject(new Cannon(0),16+9*32 ,32*25+16);
        addObject(new Cannon(0),16+10*32 ,32*25+16);
        addObject(new Cannon(0),16+11*32 ,32*25+16);
        
        spawnRow("Spike",13, 3,1, 2);
        
        
    }

}
