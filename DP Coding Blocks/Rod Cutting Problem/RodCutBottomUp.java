public class RodCutBottomUp {
    public static int RodCutBU(int[] price){
        int[] strg = new int[price.length];
        strg[0] = price[0];
        strg[1] = price[1];

        for(int n = 2; n < strg.length; n++){
            int max = price[n];
            int left = 1;
            int right = n-1;
            while(left <= right){
                int fp = strg[left];
                int sp = strg[right];
                int total = fp + sp;
                if(total > max){
                    max = total;
                }
                left++;
                right--;
            }
            strg[n] = max;
        }
        return strg[strg.length-1];
    }

    public static void main(String[] args) {
        int[] price = {0,1,5,8,9,10,17,17,20};
        System.out.println( RodCutBU(price));
    }
}

//Output: 22