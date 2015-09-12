package assignment02;




import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class a2q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make things
        City town = new City();
        Robot jarvis = new Robot(town,3,1,Direction.EAST);
        new Wall(town,3,1,Direction.SOUTH);
        new Wall(town,3,2,Direction.SOUTH);
        new Wall(town,3,3,Direction.SOUTH);
        new Wall(town,3,4,Direction.SOUTH);
        new Wall(town,3,5,Direction.SOUTH);
        new Wall(town,3,6,Direction.SOUTH);
        new Wall(town,3,7,Direction.SOUTH);
        new Wall(town,3,8,Direction.SOUTH);
        new Wall(town,3,9,Direction.SOUTH);
        new Wall(town,3,10,Direction.SOUTH);
        new Thing(town,3,10);
        new Wall(town,3,2,Direction.EAST);
        new Wall(town,3,6,Direction.EAST);
        new Wall(town,3,7,Direction.EAST);
        new Wall(town,3,4,Direction.EAST);
        //move robot
        while(!jarvis.canPickThing())
            {
          if(jarvis.frontIsClear())
              {
                  jarvis.move();
              }
          if(!jarvis.frontIsClear())
          {
             jarvis.turnLeft();
             jarvis.move();
             jarvis.turnLeft();
             jarvis.turnLeft();
             jarvis.turnLeft();
             jarvis.move();
             jarvis.turnLeft();
             jarvis.turnLeft();
             jarvis.turnLeft();
             jarvis.move();
             jarvis.turnLeft();
          }
            }
        jarvis.pickThing();
        }
    }
