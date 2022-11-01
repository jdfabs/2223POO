import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnButton extends Botao
{   
    private GreenfootImage voltaAtras;
    
    //contrutor do botao de voltar para o menu inicial    
    public ReturnButton(){
        voltaAtras = new GreenfootImage("ReturnButton.png");
        voltaAtras.scale(100,100);
        setImage(voltaAtras);
    }
    //volta para o menu inicial do jogo
    
    public void clicked()
    {
        super.clicked();
        Greenfoot.setWorld(new MenuInicial());
    }
}
