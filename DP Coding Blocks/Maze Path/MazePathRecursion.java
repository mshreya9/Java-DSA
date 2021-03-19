public class MazePathRecursion {
    public static int MPRecursion(int cr, int cc, int er, int ec){
        //Base Case
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }

        int ch = MPRecursion(cr, cc+1, er, ec);
        int cv = MPRecursion(cr+1, cc, er, ec);

        return ch+cv;
    }

    public static void main(String[] args) {
        System.out.println(MPRecursion(0, 0, 2, 2)); 
    }
}

//Output: 6
//TC: O(2 to the power er+ec)