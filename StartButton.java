import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Botao
{
    private GreenfootImage start;
    //Construtor do botão de start  
    public StartButton()
    {
        start = new GreenfootImage("StartButton.png");
        start.scale(200,75);
        setImage(start);
    }
    public void clicked()
    {
        Greenfoot.setWorld(new MenuLevelSelect());
    }
}
