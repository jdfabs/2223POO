import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnButton extends Actor
{   
    private GreenfootImage voltaAtras;
    
    //contrutor do botao de voltar para o menu inicial
    
    public ReturnButton(){
        voltaAtras = new GreenfootImage("ReturnButton.png");
        voltaAtras.scale(100,100);
        setImage(voltaAtras);
    }
    /**
     * Act - do whatever the ReturnButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        voltaMenuInicial();
    }
    
    //volta para o menu inicial do jogo
    
    public void voltaMenuInicial()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MenuInicial());
        }
    }
}
