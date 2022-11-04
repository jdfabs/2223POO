import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Stages
{
    public int cannonSpeed;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(int time)
    {
         GreenfootImage background;
         background = new GreenfootImage("Level1.jpg");
         background.scale(1000,1000);
         setBackground(background);
         timer.setTime(time);
         timer.updateTimer();
         cannonSpeed = 500+time;
         addStage();
         
    }
    public void act()
    {
        
    }
    private void addStage()
    {
        //addObject(new Wall1(),16+4*32,32*11);
        
        
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
        spawnRow("Wall1",22, 9,2, 2);
        spawnRow("Wall1",21, 9,3, 3); 
        spawnRow("Wall1",18, 1,2, 9);
        spawnRow("Spike",20, 8,1, 3);
        spawnRow("Spike",23, 5,1, 3);
        
        spawnDoorPressPlate(29, 23, 22, 20, 3, 0 );
        spawnDoorLever(30, 19, 1, 22, 22, 3, 2);


        for( i = 0; i < 3; i++){
            addObject(new Cannon(2, cannonSpeed),16+(21+i*3)*32 ,32*13+16);
        }
        for( i = 0; i < 2; i++){
            addObject(new Wall1(),16+(22+i*3)*32 ,32*13+16);
            addObject(new Wall1(),16+(23+i*3)*32 ,32*13+16);
        }
        for( i = 0; i < 3; i++){
            addObject(new Cannon(2, cannonSpeed),16+(28+i)*32 ,32*0+16);
        }
        
        spawnDoorPressPlate(26, 2, 21, 2, 27, 11, 2, 2);    //2press:1Door
        spawnDoorPressPlate(17, 3, 14, 5, 2, 3 );           //1press:1Door
        spawnDoorPressPlate(13, 7, 19, 5, 2, 3 );
        spawnDoorPressPlate(13, 7, 16, 9, 2, 1 );
        
        spawnRow("Wall1",12, 5,2, 8);        
        spawnRow("Wall1",15, 9,0, 8);
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
        for( i = 0; i < 3; i++){
            addObject(new Cannon(0,cannonSpeed),16+(9+i)*32 ,32*25+16);
        }
        for( i = 0; i < 8; i++){
            addObject(new Cannon(1,cannonSpeed),16+0*32 ,32*(6+i*2)+16);
        }
        spawnDoorLever(7, 19, 1, 8, 24, 4, 0);
        spawnDoorLever(9, 19, 3, 7, 20, 3, 3);
        
        spawnRow("Spike",13, 3,1, 2);
        
        Saida saida = new Saida();
        addObject(saida,16+2*32 ,32*(2)+16 );
        saida.setTimerRef(timer);
        
        
        spawnPlayers();
        player1.setLocation(32*27+16,32*23+16);
        player2.setLocation(32*15+16,32*23+16);
        
    }

}
