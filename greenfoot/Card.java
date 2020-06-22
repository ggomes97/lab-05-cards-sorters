import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private int width;
    private int height;
    private String cardName;
    
    public Card(double scale, String naipe, String value)
    {
        String path = "images/";
        cardName = "card"+naipe+value+".png";
        this.setImage(path+cardName);
        width = this.getImage().getWidth();
        height = this.getImage().getHeight();
        this.getImage().scale((int)(scale * width) , (int)(scale * height));        
    }
    
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        // Add your action code here.
    }    
}
