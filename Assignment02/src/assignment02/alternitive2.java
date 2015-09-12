package assignment02;




import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
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
public class alternitive2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //build things
            //City
                City town = new City();
            //walls
                //loop
                    int mazeSize=7;
                    int northWallx=1,southWallx=mazeSize,eastWally=mazeSize,westWally=1,inc=1;
                    while(inc!=mazeSize+1)
                    {
                    new Wall(town,northWallx,inc,Direction.NORTH);
                    new Wall(town,southWallx,inc,Direction.SOUTH);
                    new Wall(town,inc,eastWally,Direction.EAST);
                    new Wall(town,inc,westWally,Direction.WEST);
                    inc=inc+1;
                    }
                //inner maze
                    new Wall(town,1,1,Direction.SOUTH);
                    new Wall(town,1,2,Direction.SOUTH);
                    new Wall(town,2,2,Direction.EAST);
                    new Wall(town,1,3,Direction.EAST);
                    new Wall(town,2,3,Direction.EAST);
                    new Wall(town,3,3,Direction.WEST);
                    new Wall(town,3,3,Direction.SOUTH);
                    new Wall(town,3,4,Direction.EAST);
                    new Wall(town,4,4,Direction.EAST);
                    new Wall(town,4,4,Direction.SOUTH);
                    new Wall(town,2,5,Direction.SOUTH);
                    new Wall(town,1,4,Direction.SOUTH);
                    new Wall(town,1,6,Direction.WEST);
                    new Wall(town,1,6,Direction.SOUTH);
                    new Wall(town,2,6,Direction.SOUTH);
                    new Wall(town,2,7,Direction.SOUTH);
                    new Wall(town,4,3,Direction.SOUTH);
                    new Wall(town,4,2,Direction.SOUTH);
                    new Wall(town,4,2,Direction.WEST);
                    new Wall(town,3,2,Direction.WEST);
                    new Wall(town,4,7,Direction.SOUTH);
                    new Wall(town,4,2,Direction.WEST);
                    new Wall(town,4,6,Direction.SOUTH);
                    new Wall(town,4,6,Direction.NORTH);
                    new Wall(town,4,6,Direction.EAST);
                    new Wall(town,5,1,Direction.SOUTH);
                    new Wall(town,5,2,Direction.SOUTH);
                    new Wall(town,5,3,Direction.EAST);
                    new Wall(town,6,3,Direction.EAST);
                    new Wall(town,6,3,Direction.SOUTH);
                    new Wall(town,6,2,Direction.SOUTH);
                    new Wall(town,7,4,Direction.EAST);
                    new Wall(town,6,4,Direction.EAST);
                    new Wall(town,5,6,Direction.SOUTH);
                    new Wall(town,5,7,Direction.SOUTH);
                    new Wall(town,6,6,Direction.WEST);
                    new Wall(town,6,7,Direction.SOUTH);
            //thing
                new Thing(town,mazeSize,mazeSize);
            //robot
                Robot jarvis = new Robot(town,1,1,Direction.SOUTH);
        //AI
        while(!jarvis.canPickThing())
        {
            Boolean frontCheck=jarvis.frontIsClear();
            jarvis.turnLeft();
            if(jarvis.frontIsClear())
            {
                jarvis.move();
            }
            else if(frontCheck)
            {
                jarvis.turnLeft();
                jarvis.turnLeft();
                jarvis.turnLeft();
                jarvis.move();
            }
            else
            {
                jarvis.turnLeft();
                jarvis.turnLeft();
                if(jarvis.frontIsClear())
                {
                    jarvis.move();
                }
                else
                {
                    jarvis.turnLeft();
                    jarvis.turnLeft();
                }
            }
        }
        jarvis.pickThing();
    }
    
}
