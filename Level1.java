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

    public void setupLevel(){
        addFloor(getWidth()*3/4,750,600,50); //plataforma mais a baixo
        addFloor(getWidth()*3/4,600,480,50);//2ª plataforma a contar de baixo
        addFloor(getWidth()/4,400,200,50); //plataforma a voar
        addFloor(getWidth()*5/6,200,300,50); //plataforma final
        
        addWall(getWidth()/2+30,getHeight()/2+120,50,75);
        
        
        PressurePlate pressurePlate = new PressurePlate();
        addObject(pressurePlate, getWidth()*5/6, 720);
        
        Door door = new Door();
        addObject(door, getWidth()/2+50, 825);
        pressurePlate.setTarget(door);
        door.diferencaAberto = 150;
        
        for(int i=0; i < 5; i++){
            addObject(new Spikes(), 50+ 30*i, 860);
        }
        for(int i=0; i < 3; i++){
            addObject(new Spikes(), getWidth()/2+80+ 30*i, 560);
        }
    
    }
}
