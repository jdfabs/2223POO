import greenfoot.World;

/**
 * Write a description of class Stages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{
    // instance variables - replace the example below with your own
    private int x;
    public Player player1;
    public Player player2;

    /**
     * Constructor for objects of class Stages
     */
    public Stages()
    {
        super(1024,832,1);
        borderSetup();
        spawnPlayers();
    }

    public void borderSetup(){
        int i = 0;
        for(i = 0; i<=32; i++){
            addObject(new Wall1(),32*(i+1)-16,16);
            addObject(new Wall1(),32*(i+1)-16,32*26-16);
        }
        for(i = 0; i<=30; i++){
            addObject(new Wall1(),16,32*(i+1)-16);
            addObject(new Wall1(),32*32-16,32*(i+1)-16);
        }
    }
    public void spawnPlayers(){
        player1 = new Player();
        addObject(player1, getWidth()/4,200);
        player1.setup("w","a","d","s");
        
        player2 = new Player();
        addObject(player2, getWidth()*3/4 ,200 );
        player2.setup("up","left","right","down");
        
    }
    public void spawnRow(String entityStr,int lineStartX, int lineStartY,int direction, int amount){
       
        switch(entityStr){
            case "Wall1":
                Wall1 wall = new Wall1();
                int i = 0;
                
                switch(direction){
                    case 0:
                        for(i=0; i < amount; i++){
                            wall = new Wall1();
                            addObject(wall,32*lineStartX+16 ,32*(lineStartY-i)+16);
                    }
                        break;
                    case 1:
                        for(i=0; i < amount; i++){
                            wall = new Wall1();
                            addObject(wall,32*(lineStartX+i)+16 ,32*lineStartY+16);
                        }
                        break;
                    case 2:
                        for(i=0; i < amount; i++){
                            wall = new Wall1();
                            addObject(wall,32*lineStartX+16 ,32*(lineStartY+i)+16);
                        }
                            break;
                    case 3:
                        for(i=0; i < amount; i++){
                            wall = new Wall1();
                            addObject(wall,32*(lineStartX-i)+16 ,32*lineStartY+16);
                        }
                        break;
                    }            
                
                break;
            case "Spike":
                Spike spike = new Spike();
                
                switch(direction){
                    case 0:
                        for(i=0; i < amount; i++){
                            spike = new Spike();
                            addObject(spike,32*lineStartX+16 ,32*(lineStartY-i)+16);
                        }
                        break;
                    case 1:
                        for(i=0; i < amount; i++){
                            spike = new Spike();
                            addObject(spike,32*(lineStartX+i)+16 ,32*lineStartY+16);
                        }
                        break;
                    case 2:
                        for(i=0; i < amount; i++){
                            spike = new Spike();
                            addObject(spike,32*lineStartX+16 ,32*(lineStartY+i)+16);
                        }
                        break;
                    case 3:
                        for(i=0; i < amount; i++){
                            spike = new Spike();
                            addObject(spike,32*(lineStartX-i)+16 ,32*lineStartY+16);
                        }
                        break;
                    }            
                
                break;
        }
    }
}
