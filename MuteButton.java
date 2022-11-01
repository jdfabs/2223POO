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
    private String keyBind = "m";
    //Construtor do botão de mute
    public MuteButton()
    {
        unMuted = new GreenfootImage("UnMuted.png");
        muted = new GreenfootImage("Muted.png");
        unMuted.scale(100,100);
        muted.scale(100,100);
        setImage(unMuted);
    }
    public void clicked()
    {
            mute();
    }
    public void mute()
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
