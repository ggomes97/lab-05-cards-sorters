import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chip extends Actor
{
    /**
     * Act - do whatever the Chip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(Greenfoot.isKeyDown("d")) move(3);
        if(Greenfoot.isKeyDown("a")) move(-3);
    }
    

}
