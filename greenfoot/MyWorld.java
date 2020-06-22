import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Random;

import java.util.Collections;

import java.util.Arrays;

import java.util.List;

public class MyWorld extends World
{
    static Random rand = new Random();
    
    Card cards[];
    
    Button b;
    
    ButtonSort s;
    
    ButtonInsertSort i;
    
    ButtonSelectionSort e;
    
    String naipe = "Diamonds Clubs Hearts Spades";
    
    String[] arr = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    Integer[] baralho = new Integer[53];
    
    int inal = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        GreenfootImage bg = new GreenfootImage("background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        b = new Button(1);
        
        s = new ButtonSort(1);
        
        i = new ButtonInsertSort(1);
        
        e = new ButtonSelectionSort(1);
        
        addObject(b, 250, 500);
        
        addObject(s, 350, 500);
        
        addObject(i, 450, 500);
        
        addObject(e, 550, 500);
        
        cardCreator();
        cardShow();
        
        shuffle();
        cardShow();
        
        ordena(baralho);
        cardShow();
        
        insertionSort(baralho);
        cardShow();
    }

    public void shuffle()
    {
       Collections.shuffle(Arrays.asList(baralho));
    }
    
    public  void ordena(Integer[] v)
    {
        int n = v.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
        {             
            for(int j=1; j < (n-i); j++)
            {  
                if(v[j-1] > v[j])
                {  
                    temp = v[j-1];  
                    v[j-1] = v[j];  
                    v[j] = temp;  
                }                
            } 
        }
    }
    
    public  void insertionSort(Integer[] v) 
    {  
        int n = v.length;  
        for (int j = 1; j < n; j++) 
        {  
            int key = v[j];  
            int i = j-1;  
            while ( (i > -1) && ( v [i] > key ) ) 
            {  
                v [i+1] = v [i];  
                i--;  
            }  
            v[i+1] = key;  
        }  
    }  
    
     public static void selectionSort(Integer[] v)
     {  
        for (int i = 0; i < v.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < v.length; j++)
            {  
                if (v[j] < v[index])
                {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = v[index];   
            v[index] = v[i];  
            v[i] = smallerNumber;  
        }  
    }  
    
    public void cardShow()
    {
        int initialX = 70;
        int initialY = 90;
        int conversor = 0;
        int count = 0;
        int conversorl = 0;
        
        for (int i = 0; i <= 51; i++)
        {
            if (count == 13 || count == 26 || count == 39)
            {
                initialY += 100;
                initialX -= 715;
            }
            if (baralho[i] < 13)
            {
                cards[baralho[i]] = new Card(0.50, naipe.substring(0, 8), arr[baralho[i]]);
                addObject(cards[baralho[i]], initialX + (i * 55), initialY);
            }
            if (baralho[i] < 26 && baralho[i] >= 13)
            {
                conversor = (baralho[i] - 13);
                cards[baralho[i]] = new Card(0.50, naipe.substring(9, 14), arr[conversor]);
                addObject(cards[baralho[i]], initialX + (i * 55), initialY);
            }
            if (baralho[i] < 39 && baralho[i] >= 26)
            {
                conversor = (baralho[i] - 26);
                cards[baralho[i]] = new Card(0.50, naipe.substring(15, 21), arr[conversor]);
                addObject(cards[baralho[i]], initialX + (i * 55), initialY);
            }
            if (baralho[i] < 52 && baralho[i] >= 39)
            {
                conversor = (baralho[i] - 39);
                cards[baralho[i]] = new Card(0.50, naipe.substring(22, 28), arr[conversor]);
                addObject(cards[baralho[i]], initialX + (i * 55), initialY);
            }
            count++;
        }
    }
    
    public void cardCreator()
    {
        cards = new Card[52];
        for (int i = 0; i < baralho.length; i++)
        {
            baralho[i] = i;
        }
    }  
}
