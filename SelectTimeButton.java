import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectTimeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectTimeButton extends Botao
{
    private GreenfootImage timeOff;
    private GreenfootImage timeOn;
    private SelectTimeButton otherButton1;
    private SelectTimeButton otherButton2;
    private boolean selected = false;
    /**
     * Act - do whatever the SelectTimeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SelectTimeButton(String levelTime){
        switch(levelTime){
            case "Easy":
                timeOff = new GreenfootImage("Easy.png");
                timeOn = new GreenfootImage("EasyOn.png");
                break;
            case "Normal":
                timeOff = new GreenfootImage("Normal.png");
                timeOn = new GreenfootImage("NormalOn.png");
                break;
            case "Hard":
                timeOff = new GreenfootImage("Hard.png");
                timeOn = new GreenfootImage("HardOn.png");
                break;
        }
        timeOff.scale(200,100);
        timeOn.scale(200,100);
        setImage(timeOff);
    }
    public void clicked()
    {
        
        toggle();
    }
    public void toggle(){
        selected = !selected;
        if(selected){
            setImage(timeOn);
            if(otherButton1.selected = true){                
                otherButton1.toggle();
            }
            if(otherButton2.selected = true){                
                otherButton2.toggle();
            }
        }
        else{
            setImage(timeOff);
        }
        
    }
    public boolean returnSelected(){
        return selected;
    }
    public void setReference(SelectTimeButton button1,SelectTimeButton button2){
        otherButton1 = button1;
        otherButton2 = button2;
    }
}
