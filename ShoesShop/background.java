import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    Total total = new Total();
   
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 

        daftarSepatu();
    }
    
     public Total getTotal()
       {
          return total; 
       }
    
    private void daftarSepatu()
    {
        GreenfootImage images = getBackground();
        Color colors = new Color (50, 25, 10, 20);
        images.setColor(java.awt.Color.YELLOW);
        images.drawRect(780, 50, 200, 400);
       
        
        GreenfootImage image = getBackground();
        Color color = new Color (50, 250, 255, 50);
        images.setColor(java.awt.Color.YELLOW);
        images.drawRect(50,50,710,150);
        images.setColor(colors);
        images.fillRect(780, 50, 200, 400);
        
        Adidas1 adidas1 = new Adidas1();
        addObject(adidas1, 100, 300);
        Adidas2 adidas2 = new Adidas2();
        addObject(adidas2, 290, 300);
        Adidas3 adidas3 = new Adidas3();
        addObject(adidas3, 480, 300);
        nike1 nike1 = new nike1();
        addObject(nike1, 100, 420);
        nike2 nike2 = new nike2();
        addObject(nike2, 290, 420);
        nike3 nike3 = new nike3();
        addObject(nike3, 480, 420);
        
       Total total= new Total();
       addObject (total, 670, 400);
       
       Kurang kurang= new Kurang();
       addObject (kurang, 700, 300);
       
       Tambah tambah = new Tambah();
       addObject (tambah, 600, 300);
       
    }
}