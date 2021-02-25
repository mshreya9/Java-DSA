public class queenPermutation1D {
    static int count = 0;
    public static void main(String[] args) {
        QueenPermutation(new boolean[4], 0, 2, "");
    }

    public static void QueenPermutation(boolean[] boxes, int qpsf, int tq, String ans){
        //Base Case
        if(qpsf == tq){
            count++;
            System.out.println(count + ". " + ans);
            return;
        }

        for(int i = 0; i < boxes.length; i++){
            if(boxes[i] == false){
                boxes[i] = true;
                QueenPermutation(boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
                boxes[i] = false;
            }
        }
    }
}

//Output:

// 1. q0b0 q1b1 
// 2. q0b0 q1b2
// 3. q0b0 q1b3
// 4. q0b1 q1b0
// 5. q0b1 q1b2
// 6. q0b1 q1b3
// 7. q0b2 q1b0 
// 8. q0b2 q1b1
// 9. q0b2 q1b3
// 10. q0b3 q1b0
// 11. q0b3 q1b1
// 12. q0b3 q1b2