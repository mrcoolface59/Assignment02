package assignment02;




import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class a2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make the things
        City town = new City();
        Robot jarvis = new Robot(town,1,1,Direction.EAST);
        new Thing(town,1,2);
        new Thing(town,1,3);
        new Thing(town,1,4);
        new Thing(town,1,5);
        new Thing(town,1,6);
        new Thing(town,1,7);
        new Thing(town,1,8);
        new Thing(town,1,9);
        new Thing(town,1,10);
        new Thing(town,1,11);
        //move
        while(jarvis.getAvenue()<12)
        {
        if(jarvis.getAvenue()<8)
        {
            jarvis.move();
            jarvis.pickThing();
        }
        if(jarvis.getAvenue()>7)
        {
        jarvis.move();
        }
       }
    }
}
