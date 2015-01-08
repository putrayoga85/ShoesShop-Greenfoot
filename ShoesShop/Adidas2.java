import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adidas2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adidas2 extends Actor
{
    /**
     * Act - do whatever the Adidas2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        daftarSepatu();
    }    
    
     public void daftarSepatu()
    {
        if(Greenfoot.mouseClicked(this))
        {
            GreenfootImage price = new GreenfootImage("Harga_adidas2.png");          
            getWorld().getBackground().drawImage(price,50,50);
        }
    }
}
