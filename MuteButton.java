import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MuteButton extends Botao
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
        keyBind = "m";
    }
    public void clicked()
    {
            mute();
    }
    public void mute()
    {       
            if(verificaMusica==false)
            {
                getWorldOfType(MenuStart.class).somFundo().pause();
                verificaMusica = true;
                setImage(muted);
            }
            else
            {
                getWorldOfType(MenuStart.class).somFundo().playLoop();     
                verificaMusica = false;
                setImage(unMuted);
            }
    }
}
