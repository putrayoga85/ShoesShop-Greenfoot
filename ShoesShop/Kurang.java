import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kurang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kurang extends Actor
{
    /**
     * Act - do whatever the Kurang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Total() 
    {   
        if (Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            ((background)w).getTotal().Total();
        }  
    }    
}
