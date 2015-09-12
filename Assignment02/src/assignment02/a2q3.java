package assignment02;




import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class a2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=6,y=6;
        //make things
        City town = new City();
        Robot jarvis = new Robot(town,x,y,Direction.NORTH);
        new Thing(town,0,0);
        //move robot
        while(!jarvis.canPickThing())
        {
            while(jarvis.getStreet()!=0)
            {
                jarvis.move();
            }
            jarvis.turnLeft();
            while(jarvis.getAvenue()!=0)
            {
                jarvis.move();
            }
        }
        jarvis.pickThing();
    }
    
}
