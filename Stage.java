import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        this.setBackground(new GreenfootImage("Blue.png"));
        prepare();
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player, 116, 503);
        Platform platform = new Platform();
        addObject (platform,290, 539);
        Platform platform1 = new Platform();
        addObject (platform1,390, 539);
        Platform platform2 = new Platform();
        addObject (platform2,490, 539);
        Platform platform3 = new Platform();
        addObject (platform3,590, 539);
        Spike_platform spike_platform = new Spike_platform();
        addObject (spike_platform,690, 604);
        Platform platform5 = new Platform();
        addObject (platform5,790, 539);
        Platform platform6 = new Platform();
        addObject (platform6,890, 539);
        Platform platform7 = new Platform();
        addObject (platform7,190, 639);
        Platform platform8 = new Platform();
        addObject (platform8,90, 639);
        Platform platform9 = new Platform();
        addObject (platform9,990, 539);
    }
}
