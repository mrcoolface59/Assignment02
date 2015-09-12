package assignment02;




import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class a2q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make things
        City town = new City();
        Robot jarvis = new Robot(town,2,1,Direction.NORTH);
        new Wall(town,1,1,Direction.NORTH);
        new Wall(town,1,1,Direction.SOUTH);
        new Wall(town,1,1,Direction.EAST);
        new Wall(town,1,1,Direction.WEST);
        new Wall(town,1,4,Direction.NORTH);
        new Wall(town,1,4,Direction.SOUTH);
        new Wall(town,1,4,Direction.EAST);
        new Wall(town,1,4,Direction.WEST);
        new Wall(town,4,1,Direction.NORTH);
        new Wall(town,4,1,Direction.SOUTH);
        new Wall(town,4,1,Direction.EAST);
        new Wall(town,4,1,Direction.WEST);
        new Wall(town,4,4,Direction.NORTH);
        new Wall(town,4,4,Direction.SOUTH);
        new Wall(town,4,4,Direction.EAST);
        new Wall(town,4,4,Direction.WEST);
        new Wall(town,2,2,Direction.NORTH);
        new Wall(town,2,2,Direction.WEST);
        new Wall(town,2,3,Direction.NORTH);
        new Wall(town,2,3,Direction.EAST);
        new Wall(town,3,2,Direction.SOUTH);
        new Wall(town,3,2,Direction.WEST);
        new Wall(town,3,3,Direction.SOUTH);
        new Wall(town,3,3,Direction.EAST);
        //move
        while(!jarvis.frontIsClear())
        {
            jarvis.turnLeft();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.move();
        }
        }
    }
