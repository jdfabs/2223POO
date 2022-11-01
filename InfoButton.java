import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoButton extends Botao
{
    private GreenfootImage info;
    //Construtor do botão de info
    public InfoButton()
    {
        info = new GreenfootImage("HelpButton.png");
        info.scale(100,100);
        setImage(info);
    }

    public void clicked()
    {
        super.clicked();
        Greenfoot.setWorld(new MenuInfo());
    }
}
