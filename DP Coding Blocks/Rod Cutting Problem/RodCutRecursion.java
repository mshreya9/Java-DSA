public class RodCutRecursion {
    public static int RodCutRecursion(int[] price, int n){
        int max = price[n];
        int left = 1;
        int right = n-1;
        while(left <= right){
            int fp = RodCutRecursion(price, left);
            int sp = RodCutRecursion(price, right);

            int total = fp + sp;
            if(total > max){
                max = total;
            }
            left++;
            right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] price = {0,1,5,8,9,10,17,17,20};
        int n = price.length-1;
        System.out.println(RodCutRecursion(price, n)); 
    }
}

//Output: 22