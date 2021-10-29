class Solution {
    public static void main(String[] args){
        //Left Shift 
        //01010 (10) -> on left shifting -> 10100 (20)
        //It is similar to -> a << b = a * (2^b)
        int a = 10;
        int b = 1;
        System.out.println("a<<b = " + (a<<b));

        //Right Shift 
        //001100 (12) -> on right shifting -> 000110 (6)
        //It is similar to -> a >> b = a / (2^b)
        int c = 12;
        int d = 1;
        System.out.println("c>>d = " + (c>>d));

    }
}

//Output

// a<<b = 20
// c>>d = 6