import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Stages
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(){
        setupLevel();
    }

    public void setupLevel(){
        int i = 0;
        for(i = 0; i<=32; i++){
            addObject(new Wall1(),32*(i+1)-16,16);
            addObject(new Wall1(),32*(i+1)-16,32*26-16);
        }
        for(i = 0; i<=30; i++){
            addObject(new Wall1(),32*(i+1)-16,16);
        }
    }
}
