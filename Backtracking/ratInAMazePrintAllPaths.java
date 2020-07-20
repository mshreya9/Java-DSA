import java.util.*;
class RatInMaze {
    public static void ratInAMaze(int maze[][]){
        int n = maze.length;
        int path[][] = new int[n][n];
        printAllPaths(maze, 0, 0, path);
    }

    public static void printAllPaths(int maze[][], int i, int j, int path[][]){
        //Check if i, j cell is valid or not
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }

        //Include the cell in current path
        path[i][j] = 1;

        //Destination Cell
        if(i == n-1 && j == n-1){
            //printing a path (one of many possible paths)
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        //Explore further in all directions
        //Top
       printAllPaths(maze, i-1, j, path);
        //Right
        printAllPaths(maze, i, j+1, path);
        //Down
        printAllPaths(maze, i+1, j, path);
        //Left
        printAllPaths(maze, i, j-1, path);
        path[i][j] = 0;        

    }
    public static void main(String[] args) {
        int maze[][] = {{1,1,0}, {1,1,0}, {1,1,1}}; 
        ratInAMaze(maze);
        
    }
}

