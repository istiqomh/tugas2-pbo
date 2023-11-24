import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spike_platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike_platform extends Actor
{
    /**
     * Act - do whatever the spike_platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spike_platform ()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*10/5;
        int myNewWidth = (int)myImage.getWidth()*10/5;
        myImage.scale(myNewWidth, myNewHeight);
    
    }
    
    
    public void act()
    {
        
    }
}
