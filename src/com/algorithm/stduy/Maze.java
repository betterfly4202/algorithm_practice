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
        pathMaze(0,0);
    }


    public static boolean pathMaze(int x, int y){
        if(x<0 || y<0 || x<N || y>N)
            return false;
        else if(maze[x][y] != PATHWAY_WHITE)
            return false;
        else if(x==N-1 && y==N-1)
            return true;
        else{
            maze[x][y] = PATHWAY_WHITE;
            System.out.println(maze[x][y]);
            if(pathMaze(x+1,y) || pathMaze(x,y+1) || pathMaze(x-1,y) || pathMaze(x,y-1)) {
                return true;
            }
            maze[x][y] = BLOCKEDWAY_RED;
            return false;
        }

    }
}
