import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Stages
{
    public int cannonSpeed;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2(int time)
    {
         timer.timeLeft = time;
         timer.updateTimer();
         cannonSpeed = 500+time;
         addStage();
    }
    private void addStage()
    {
        //addObject(new Wall1(),16+4*32,32*11);
        player1.setLocation(32*6+16,32*23+16);
        player2.setLocation(32*27+16,32*23+16);
        
        int i = 0;
        
        spawnRow("Wall1",21, 18,1, 7);
        spawnRow("Wall1",20, 25,0, 21);
        spawnRow("Wall1",9, 18,2, 7);
        spawnRow("Wall1",3, 18,1, 6);
        spawnRow("Wall1",9, 17,0, 13);
        spawnRow("Wall1",20, 13,1, 8);
        spawnRow("Wall1",27, 12,0, 4);
        spawnRow("Wall1",20, 5,1, 8);
        spawnRow("Wall1",17, 9,1, 3);
        spawnRow("Wall1",10, 9,1, 3);
        spawnRow("Wall1",12, 12,2, 2);
        spawnRow("Wall1",10, 13,1, 3);
        spawnRow("Wall1",17, 13,1, 3);
        
        
        spawnRow("Spike",3, 17,1, 6);
        spawnRow("Spike",1, 14,1, 6);
        spawnRow("Spike",3, 11,1, 6);
        spawnRow("Spike",1, 8,1, 6);
        spawnRow("Spike",3, 5,1, 6);
        spawnRow("Spike",3, 21,1, 4);
        spawnRow("Spike",3, 22,2, 3);
        spawnRow("Spike",21, 9,1, 2);
        spawnRow("Spike",25, 9,1, 2);
        spawnRow("Spike",27, 21, 3, 4);
        spawnRow("Spike",24, 22, 2, 3);
        spawnRow("Spike",23, 3,2, 2);
        spawnRow("Spike",27, 1,2, 2);
        spawnRow("Spike",17, 1,2, 3);
        spawnRow("Spike",12, 1,2, 3);
        spawnRow("Spike",13, 17,1, 4);
        spawnRow("Spike",13, 20,1, 4);
        spawnRow("Spike",13, 24,1, 1);
        spawnRow("Spike",16, 24,1, 1);
        
        spawnDoorLever(1, 22, 3, 30, 18, 3, 3);
        spawnDoorLever(26, 12, 1, 9, 1, 4, 2);
        spawnDoorLever(10, 12, 3, 13, 13, 4, 1);
        
        spawnDoorPressPlate(22, 23, 1, 18, 2, 1 );
        spawnDoorPressPlate(5, 2, 20, 1, 4, 2 );
        spawnDoorPressPlate(18, 11, 12, 10, 2, 2 );

        
        spawnDoorPressPlate(14, 1, 18, 11, 13, 9, 4, 1);
        for( i = 0; i < 3; i++){
            addObject(new Cannon(0, cannonSpeed),16+(17+i)*32 ,32*(25)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Cannon(0, cannonSpeed),16+(10+i)*32 ,32*(25)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Cannon(2, cannonSpeed),16+(10+i)*32 ,32*(13)+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Cannon(2, cannonSpeed),16+(17+i)*32 ,32*(13)+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Cannon(0, cannonSpeed),16+(19)*32 ,32*(9)+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Cannon(2, cannonSpeed),16+(23+i)*32 ,32*(5)+16);
        }
        for( i = 0; i < 4; i++){
            addObject(new Cannon(1, cannonSpeed),16+(20)*32 ,32*(17-i)+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Cannon(2, cannonSpeed),16+(1+i)*32 ,32*0+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Cannon(2, cannonSpeed),16+(7+i)*32 ,32*0+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Cannon(2, cannonSpeed),16+(28+i)*32 ,32*0+16);
        }
        
        //spawnDoorPressPlate(5, 5, 5, 5, 5, 11, 2, 2);    //2press:1Door
                  //1press:1Door
        
        
        
        addObject(new Saida(),16+15*32 ,32*(23)+16 );
        
        
    }
}

