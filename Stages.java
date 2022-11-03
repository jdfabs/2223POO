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
    public HPText hpText1;
    public HPText hpText2;
    public Timer timer;

    /**
     * Constructor for objects of class Stages
     */
    public Stages()
    {
        super(1024,832,1);
        borderSetup();
        spawnPlayers();
        timer = new Timer();
        addObject(timer, getWidth()/2 , 15);
    }

    private void borderSetup(){
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
    private void spawnPlayers(){
        player1 = new Player(1);
        hpText1 = new HPText();
        addObject(player1, getWidth()/4,200);
        addObject(hpText1, 100,getHeight()-15);
        player1.setup("w","a","d","s", hpText1,1);
        
        player2 = new Player(2);
        hpText2 = new HPText();
        addObject(player2, getWidth()*3/4 ,200 );
        addObject(hpText2, getWidth()-100,getHeight()-15);
        player2.setup("up","left","right","down", hpText2,2);
        
        hpText1.playerNum=1;
        hpText2.playerNum=2;
        hpText1.changeText(3);
        hpText2.changeText(3);
    }
    
    //Metodo para ajudar construção dos niveis, spikes e paredes
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
    
    //metodo para ajudar a construir portas e pressure plates 1:1
    public void spawnDoorPressPlate(int pressX, int pressY,int doorStartX, int doorStartY,int doorLength, int doorDirection ){
        PressPlate pressPlate = new PressPlate();
        Door door;
        addObject(pressPlate,32*pressX+16,32*pressY+16);
        int i = 0;
        for(i =0 ; i < doorLength;i++){
            door = new Door();
            switch(doorDirection){
                case 0:
                    addObject(door,16+doorStartX*32,32*(doorStartY-i) +16);                    
                    break;
                case 1:
                    addObject(door,16+(doorStartX+i)*32,32*doorStartY +16); 
                    door.setRotation(90);
                    break;
                case 2:
                    addObject(door,16+doorStartX*32,32*(doorStartY+i) +16);
                    break;
                case 3:
                    addObject(door,16+(doorStartX-i)*32,32*doorStartY +16);
                    door.setRotation(90);
                    break;
                
            }            
            door.setup(doorLength,doorDirection);
            pressPlate.target[i] = door;
        }
    }
    //Para criar 2 pressure plates que ativam a mesma porta
    
    public void spawnDoorPressPlate(int press1X, int press1Y,int press2X, int press2Y ,int doorStartX, int doorStartY,int doorLength, int doorDirection ){
        PressPlate pressPlate1 = new PressPlate();
        PressPlate pressPlate2 = new PressPlate();
        Door door;
        addObject(pressPlate1,32*press1X+16,32*press1Y+16);
        addObject(pressPlate2,32*press2X+16,32*press2Y+16); 
        int i = 0;
        for(i =0 ; i < doorLength;i++){
            door = new Door();
            switch(doorDirection){
                case 0:
                    addObject(door,16+doorStartX*32,32*(doorStartY-i) +16);                    
                    break;
                case 1:
                    addObject(door,16+(doorStartX+i)*32,32*doorStartY +16);
                    door.setRotation(90);
                    break;
                case 2:
                    addObject(door,16+doorStartX*32,32*(doorStartY+i) +16);
                    break;
                case 3:
                    addObject(door,16+(doorStartX-i)*32,32*doorStartY +16);
                    door.setRotation(90);
                    break;
                
            }            
            door.setup(doorLength,doorDirection);
            pressPlate1.target[i] = door;
            pressPlate2.target[i] = door;
        }
    }
    //metodo para ajudar a construir portas e pressure plates levers 1:1
    public void spawnDoorLever(int leverX, int leverY,int leverDirection,int doorStartX, int doorStartY,int doorLength, int doorDirection ){
        Lever lever = new Lever();
        Door door;
        addObject(lever,32*leverX+16,32*leverY+16);
        lever.setup(leverDirection);
        int i = 0;
        for(i =0 ; i < doorLength;i++){
            door = new Door();
            switch(doorDirection){
                case 0:
                    addObject(door,16+doorStartX*32,32*(doorStartY-i) +16);                    
                    break;
                case 1:
                    addObject(door,16+(doorStartX+i)*32,32*doorStartY +16);       
                    door.setRotation(90);
                    break;
                case 2:
                    addObject(door,16+doorStartX*32,32*(doorStartY+i) +16);
                    break;
                case 3:
                    addObject(door,16+(doorStartX-i)*32,32*doorStartY +16);
                    door.setRotation(90);                    
                    break;
                
            }            
            door.setup(doorLength,doorDirection);
            lever.target[i] = door;
        }    
    }
}
