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
public class alternitive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //build things
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
                    new Wall(town,2,4,Direction.SOUTH);
                    new Wall(town,4,3,Direction.EAST);
            //thing
                new Thing(town,mazeSize,mazeSize);
            //robot
                Robot jarvis = new Robot(town,1,1,Direction.SOUTH);
                //AI
                while(!jarvis.canPickThing())
                {
                    jarvis.turnLeft();
                    if(jarvis.frontIsClear())
                    {
                        jarvis.move();
                    }
                    else if(!jarvis.frontIsClear())
                    {
                        jarvis.turnLeft();
                        jarvis.turnLeft();
                        jarvis.turnLeft();
                        if(jarvis.frontIsClear())
                        {
                            jarvis.move();
                        }
                        else if(!jarvis.frontIsClear())
                        {
                            jarvis.turnLeft();
                            jarvis.turnLeft();
                            jarvis.turnLeft();
                            if(jarvis.frontIsClear())
                            {
                                jarvis.move();
                            }
                            else if(!jarvis.frontIsClear())
                            {
                                jarvis.turnLeft();
                                jarvis.turnLeft();
                            }
                        }
                    }
                }
                jarvis.pickThing();
    }
    
}