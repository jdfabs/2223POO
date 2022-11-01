import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends DynamicObject
{
    
    
    /*public String  up = "w", down = "s", left = "a", right = "d" ;
    int speed = 2;
    
    private int[] movimentoValores = new int[2];
    
    
    public void act()
    {        
        movimentoValores = Movimento(movimentoValores[0],movimentoValores[1]);
    }
    public void Setup(String u, String d, String l, String r){
        up = u;
        down = d;
        left = l;
        right = r;
    }
    int[] Movimento (int movVert,int movHor){
        int movimentoVertical = movVert; //1 sem movimento, 2 cima, 3 baixo
        int movimentoHorizontal = movHor; //1 sem movimento, 2 direita, 3 esquerda
        int[] movimentoValores = new int[2];
        if(movimentoHorizontal == 0 || movimentoVertical == 0){
            movimentoHorizontal = 1;
            movimentoVertical = 1;
        }
        movimentoValores[0] = movimentoVertical;
        movimentoValores[1] = movimentoHorizontal;
        
        switch(movimentoVertical){
            case 1:
                if (Greenfoot.isKeyDown(up) && CheckCollision("up") == false)
                {
                    
                    setLocation(getX(), getY()-speed);
                    movimentoValores[0] = 2;
                }
                else if (Greenfoot.isKeyDown(down) && CheckCollision("down") == false)
                {
                    setLocation(getX(), getY()+speed);
                    movimentoValores[0] = 3;
                }
                break;
            case 2:
                if(!Greenfoot.isKeyDown(up) && !Greenfoot.isKeyDown(down)){
                    movimentoValores[0] = 1;
                }
                else if (Greenfoot.isKeyDown(up) && CheckCollision("up") == false)
                {
                    setLocation(getX(), getY()-speed);
                }
                else if (Greenfoot.isKeyDown(down)  && CheckCollision("down") == false)
                {
                    setLocation(getX(), getY()+speed);
                    movimentoValores[0] = 3;
                }
                break;
            case 3:
                if(!Greenfoot.isKeyDown(up) && !Greenfoot.isKeyDown(down)){
                    movimentoValores[0] = 1;
                }
                else if (Greenfoot.isKeyDown(down) && CheckCollision("down") == false)
                {
                    setLocation(getX(), getY()+speed);
                }
                else if (Greenfoot.isKeyDown(up) && CheckCollision("up") == false)
                {
                    setLocation(getX(), getY()-speed);
                    movimentoValores[0] = 2;
                }
                break;
        }       
        
        switch(movimentoHorizontal){
            case 1:
                if (Greenfoot.isKeyDown(right)  && CheckCollision("right") == false)
                {
                    setLocation(getX()+speed, getY());
                    movimentoValores[1] = 2;
                }
                else if (Greenfoot.isKeyDown(left)  && CheckCollision("left") == false)
                {
                    setLocation(getX()-speed, getY());
                    movimentoValores[1] = 3;
                }
                break;
            case 2:
                if(!Greenfoot.isKeyDown(right) && !Greenfoot.isKeyDown(left)){
                    movimentoValores[1] = 1;
                }
                else if (Greenfoot.isKeyDown(right)  && CheckCollision("right") == false)
                {
                    setLocation(getX()+speed, getY());
                }
                else if (Greenfoot.isKeyDown(left)  && CheckCollision("left") == false)
                {
                    setLocation(getX()-speed, getY());
                    movimentoValores[1] = 3;
                }
                break;
            case 3:
                if(!Greenfoot.isKeyDown(right) && !Greenfoot.isKeyDown(left)){
                    movimentoValores[1] = 1;
                }
                else if (Greenfoot.isKeyDown(left)  && CheckCollision("left") == false)
                {
                    setLocation(getX()-speed, getY());
                }
                else if (Greenfoot.isKeyDown(right)  && CheckCollision("right") == false)
                {
                    setLocation(getX()+speed, getY());
                    movimentoValores[1] = 2;
                }
                break;
        }   
 
        return movimentoValores;
    }
    
    boolean CheckCollision(String direction){
        boolean isColliding = false;
        for (Object obj : getIntersectingObjects(Actor.class))
        {            
            Actor colliding = (Actor) obj;
            if (direction == "up" && colliding.getX()>this.getX()){
                isColliding = true;
                System.out.println("is colliding");
            }
            if (direction == "down" && colliding.getX()<this.getX()){
                isColliding = true;
                System.out.println("is colliding");
            }
            if (direction == "left" && colliding.getY()>this.getY()){
                isColliding = true;
                System.out.println("is colliding");
            }
            if (direction == "right" && colliding.getY()<this.getY()){
                isColliding = true;
                System.out.println("is colliding");
            }
        }
        return isColliding;
    }*/
}
