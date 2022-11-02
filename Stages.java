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

    /**
     * Constructor for objects of class Stages
     */
    public Stages()
    {
        super(1024,832,1);
        borderSetup();
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
}
