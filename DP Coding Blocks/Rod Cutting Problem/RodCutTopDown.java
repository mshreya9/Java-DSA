public class RodCutTopDown {
    public static int RodCutTD(int[] price, int n, int[] strg){
        if(strg[n] != 0){
            return strg[n];
        }

        int max = price[n];
        int left = 1;
        int right = n-1;
        while(left <= right){
            int fp = RodCutTD(price, left, strg);
            int sp = RodCutTD(price, right, strg);

            int total = fp + sp;
            if(total > max){
                max = total;
            }
            left++;
            right--;
        }

        strg[n] = max;
        return max;
    }

    public static void main(String[] args) {
        int[] price = {0,1,5,8,9,10,17,17,20};
        int n = price.length-1;
        int[] strg = new int[price.length];
        System.out.println(RodCutTD(price, n, strg));
    }
}

//Output: 22