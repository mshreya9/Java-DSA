public class queenCombination1D {
    static int count = 0;

    public static void main(String[] args) {
        QueenCombination(new boolean[4], 0, 2, "", -1);
    }

    public static void QueenCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
        // Base Case
        if (qpsf == tq) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }

        for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
            boxes[i] = true;
            QueenCombination(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
            boxes[i] = false;
        }
    }
}

// Output:

// 1. q0b0 q1b1
// 2. q0b0 q1b2
// 3. q0b0 q1b3
// 4. q0b1 q1b2
// 5. q0b1 q1b3
// 6. q0b2 q1b3