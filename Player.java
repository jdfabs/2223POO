import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends DynamicObject
{
    public String  up = "w", down = "s", left = "a", right = "d" ;
    public int hp = 3;
    public boolean damageReady= true;
    public int damageCooldown = 0;
    public HPText hpText =  null;
    private int character;
    private GreenfootImage PigFrente;
    private GreenfootImage PigDireita;
    private GreenfootImage PigEsquerda;
    private GreenfootImage PigCostas;
    private GreenfootImage DuckFrente;
    private GreenfootImage DuckDireita;
    private GreenfootImage DuckEsquerda;
    private GreenfootImage DuckCostas;
    
    public Player(int charSelect)
    {
    PigFrente = new GreenfootImage("PigFrente.png");
    PigDireita = new GreenfootImage("PigDireita.png");
    PigEsquerda = new GreenfootImage("PigEsquerda.png");
    PigCostas = new GreenfootImage("PigCostas.png");
    DuckFrente = new GreenfootImage("DuckFrente.png");
    DuckDireita = new GreenfootImage("DuckDireita.png");
    DuckEsquerda = new GreenfootImage("DuckEsquerda.png");
    DuckCostas = new GreenfootImage("DuckCostas.png");
    character = charSelect;
    }
    
    public void act()
    {        
        super.act();
        movimento(character); 
        loseHP(); 
        checkGameLoss();
    }
    private void movimento(int character){
        if(Greenfoot.isKeyDown(left) && isWalkable("left")){
            setLocation(getX()-3,getY());
            if(character == 1)
            {
                setImage(PigEsquerda);
            }
            else
            {
                setImage(DuckEsquerda);
            }
        }    
        if(Greenfoot.isKeyDown(right) && isWalkable("right")){
            setLocation(getX()+3,getY());
            if(character == 1)
            {
                setImage(PigDireita);
            }
            else
            {
                setImage(DuckDireita);
            }
        }
        if(Greenfoot.isKeyDown(up) && isWalkable("up")){
            setLocation(getX(),getY()-3);
            if(character == 1)
            {
                setImage(PigCostas);
            }
            else
            {
                setImage(DuckCostas);
            }
        }
        if(Greenfoot.isKeyDown(down) && isWalkable("down")){
            setLocation(getX(),getY()+3);
            if(character == 1)
            {
                setImage(PigFrente);
            }
            else
            {
                setImage(DuckFrente);
            }
        }
    }
    private void checkGameLoss(){
        if(hp == 0){
            Greenfoot.setWorld(new GameEnd(0));
        }
    }

    public void setup(String upKey, String leftKey, String rightKey, String downKey, HPText text, int character){        
            up = upKey;
            left = leftKey; 
            right = rightKey;
            down = downKey;
            hpText = text;
            //character = charSelect;
    }
    private void loseHP(){
        Actor spike = getOneIntersectingObject(Spike.class);
        Actor bala = getOneIntersectingObject(Bala.class);
        
        if(damageCooldown > 0){
            damageCooldown--;
            
        }
        else if(damageCooldown == 0){
            damageReady = true;
        }        
        if(damageReady && (spike != null || bala != null)){
            hp--;
            
            hpText.changeText(hp);
            damageReady = false;
            damageCooldown = 120;
        }        
    }
}
