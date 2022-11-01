import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MuteButton extends Actor
{
    private GreenfootImage unMuted;
    private GreenfootImage muted;
    private boolean verificaMusica = false;
    //Construtor do botão de mute
    public MuteButton()
    {
        unMuted = new GreenfootImage("UnMuted.png");
        muted = new GreenfootImage("Muted.png");
        unMuted.scale(100,100);
        muted.scale(100,100);
        setImage(unMuted);
    }
    /**
     * Act - do whatever the mute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mute();
    }
    public void mute()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(verificaMusica==false)
            {
                getWorldOfType(MenuInicial.class).somFundo().pause();
                verificaMusica = true;
                setImage(muted);
            }
            else
            {
                getWorldOfType(MenuInicial.class).somFundo().playLoop();     
                verificaMusica = false;
                setImage(unMuted);
            }
        }
    }
}
