import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Chip c;
    Card cards[];
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        c = new Chip();
        cards = new Card[10];
        int initialX = 30;
        for(int i = 2; i < cards.length; i++){
             cards[i] = new Card(0.75, "Clubs", i);
             addObject(cards[i], 30 + (i * 24), 90);
        }
        //card = new Card(0.5, "Clubs", 2);
        //addObject(card, Greenfoot.getRandomNumber(this.getWidth()), Greenfoot.getRandomNumber(this.getHeight()));
        addObject(c, 0, 300);
    }
}
