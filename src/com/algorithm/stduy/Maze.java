package com.algorithm.stduy;

/**
 * Created by betterFLY on 2017. 11. 26.
 * Github : http://github.com/betterfly88
 */

public class Maze {
    private static int PATHWAY_WHITE = 0;
    private static int WALL_BLUE = 1;
    private static int BLOCKEDWAY_RED = 2;
    private static int AVAILABLEWAY_GREEN = 3;

    // Maze base condition
    private static int N=8;
    private static int [][] maze = {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };

    public static void main(String [] mazeString){
        System.out.println("maze state = "+maze[0][7]);
    }


    public static boolean pathMaze(int x, int y){
        if(x<0 || y<0)
            return false;
        else
            return true;
//        else if(maze[x][y] == 0)
//            return true;
    }
}
