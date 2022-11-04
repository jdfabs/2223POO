import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int timeLeft = 300;
    private int timeCounter;
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Timer(){
        setImage(new GreenfootImage("TIME LEFT: " + timeLeft, 24, Color.RED, null));

    }
    public void act()
    {
        countDown();
    }
    private void countDown(){
        timeCounter = (timeCounter+1)%55; //%55 porque GreenFoot corre a 55FPS
        if (timeCounter == 0)
        {
            timeLeft--;
            updateTimer();          
        } 
        if (timeLeft == 0)
        {
            Greenfoot.setWorld(new GameEnd());
        }
    }
    public void updateTimer(){
        setImage(new GreenfootImage("TIME LEFT: " + timeLeft, 24, Color.RED, null));
    }
    public int returnTimeLeft(){
        return timeLeft;
    }
    public void setTime(int time){
        timeLeft = time;
    }

}
