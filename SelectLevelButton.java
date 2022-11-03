import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevelButton extends Botao
{
    /**
     * Act - do whatever the SelectLevelButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage levelOff;
    private GreenfootImage levelOn;
    
    public SelectLevelButton otherButton;
    
    public boolean selected = false;
    public SelectLevelButton(String levelName){
        switch(levelName){
            case "Level1":
                levelOff = new GreenfootImage("Level1.png");
                levelOn = new GreenfootImage("Level1On.png");
                break;
            case "Level2":
                levelOff = new GreenfootImage("Level2.png");
                levelOn = new GreenfootImage("Level2On.png");
                break;
        }
        levelOff.scale(200,100);
        levelOn.scale(200,100);
        setImage(levelOff);
    }
    public void clicked()
    {
        
        toggle();
    }
    public void toggle(){
        selected = !selected;
        if(selected){
            setImage(levelOn);
            if(otherButton.selected = true){                
                otherButton.toggle();
            }
        }
        else{
            setImage(levelOff);
        }
        
    }
}
