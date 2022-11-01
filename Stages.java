import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{
    private double initTime = System.currentTimeMillis();
    private double time;
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Stages()
    {
        super(1000, 900, 1);  
        setupBorders();        
        setupLevel();  
        setupPlayer();
    }
     public void setupPlayer(){        
        Player player1 = new Player();
        Player player2 = new Player();
        
        addObject(player1, 300, 750);
        player1.setup("w", "a", "d", "s");
        addObject(player2, 700, 750);
        player2.setup("up", "left", "right", "down");
    }
    public void setupBorders(){
        Actor floor = new Floor();
        addObject(floor,getWidth()/2, 900);
        floor.getImage().scale(1000,50);

        Actor wallLeft = new Wall();
        addObject(wallLeft,0, getHeight()/2);
        wallLeft.getImage().scale(50,1000);
        
        Actor wallRight = new Wall();
        addObject(wallRight,1000, getHeight()/2);
        wallRight.getImage().scale(50,1000);
    }
    public void setupLevel(){
        
    }
    public void timer(){
        time = 60;
        showText("Time left: " + time, 150,150);
        time = time - ((System.currentTimeMillis() - initTime) / 1000);
    }
    public void addFloor(int x, int y, int scaleX, int scaleY){
        Floor objecto = new Floor();
        addObject(objecto,x, y);
        objecto.getImage().scale(scaleX,scaleY);        
    }
    public void addWall(int x, int y, int scaleX, int scaleY){
        float scaleYFloat = scaleY;
        float floatY = y;
        int floorY = Math.round(y-60*scaleYFloat/100);
        System.out.println(floorY);
        
        Floor floor = new Floor();
        addObject(floor,x,floorY+30);
        floor.getImage().scale(scaleX-5,50);
        
        Wall objecto = new Wall();
        addObject(objecto,x, y);
        objecto.getImage().scale(scaleX,scaleY);        
    }
    
    
}
