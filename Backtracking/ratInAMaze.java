class RatInMaze {
    public static boolean ratInAMaze(int maze[][]){
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
        //Check if i, j cell is valid or not
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }

        //Include the cell in current path
        path[i][j] = 1;

        //Destination Cell
        if(i == n-1 && j == n-1){
            return true;
        }

        //Explore further in all directions
        //Top
        if(solveMaze(maze, i-1, j, path)){
            return true;
        }
        //Right
        if(solveMaze(maze, i, j+1, path)){
            return true;
        }
        //Down
        if(solveMaze(maze, i+1, j, path)){
            return true;
        }
        //Left
        if(solveMaze(maze, i, j-1, path)){
            return true;
        }
        return false;
        

    }
    public static void main(String[] args) {
        int maze[][] = {{1,1,0}, {1,1,0}, {1,1,1}}; //Ans--> true
        boolean pathPossible = ratInAMaze(maze);
        System.out.println(pathPossible);
    }
}

//This code just tells whether there exists a path so that rat can go from source to destination.