import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuLevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuLevelSelect extends Menu
{
    private GreenfootImage menuInicial;
    private GreenfootSound som;
    private SelectLevelButton button1;
    private SelectLevelButton button2;
    private SelectTimeButton button3;
    private SelectTimeButton button4;
    private SelectTimeButton button5;
    
    
    /**
     * Constructor for objects of class MenuLevelSelect.
     * 
     */
    public MenuLevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1000, 900, 1);
        
        menuInicial = new GreenfootImage("MenuInicial.jpeg");
        menuInicial.scale(1000,1000);
        setBackground(menuInicial);
        
        
        button1 = new SelectLevelButton("Level1");
        button2 = new SelectLevelButton("Level2");
        addObject(button1, getWidth()/3,getHeight()/3);
        addObject(button2, getWidth()/3,getHeight()*2/3);
        button1.setReference(button2);
        button2.setReference(button1);
        
        button3 = new SelectTimeButton("Easy");
        button4 = new SelectTimeButton("Normal");
        button5 = new SelectTimeButton("Hard");
        
        addObject(button3, getWidth()*2/3,getHeight()/4);
        addObject(button4, getWidth()*2/3,getHeight()*2/4);
        addObject(button5, getWidth()*2/3,getHeight()*3/4);
        button3.setReference(button4,button5);
        button4.setReference(button3,button5);
        button5.setReference(button4,button3);
        
        ReturnButton volta = new ReturnButton();
        addObject(volta, getWidth()-50,getHeight()-50);
        
    }
    public void act(){
        startSelectedLevel();
    }
    public void startSelectedLevel(){
        int selectedTime = 300;
        if((button1.returnSelected() || button2.returnSelected())&&(button3.returnSelected() || button4.returnSelected() || button5.returnSelected()))
        {
            if(button3.returnSelected()){
                selectedTime = 300;
            }
            if(button4.returnSelected()){
                selectedTime = 200;
            }
            if(button5.returnSelected()){
                selectedTime = 100;
            }
            if(button1.returnSelected()){
                Greenfoot.setWorld(new Level1(selectedTime));
            }
            if(button2.returnSelected()){
                Greenfoot.setWorld(new Level2(selectedTime));
            }
        }
        }
    }

