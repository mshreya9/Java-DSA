public class MCMRecursion {
    public static int MCMRecursion(int[] arr, int si, int ei){
        //Base Case
        if(si+1 == ei){
            return 0;
        }

        int min = Integer.MAX_VALUE;

        //k: splits
        for(int k = si+1; k <= ei-1; k++){
            int fp = MCMRecursion(arr, si, k); //arr[si]*arr[k]
            int sp = MCMRecursion(arr, k, ei); //arr[k]*arr[ei]
            int sw = arr[si] * arr[k] * arr[ei];
            int total = fp + sp + sw;
            if(total < min){
                min = total;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        int si = 0;
        int ei = arr.length-1;
        System.out.println(MCMRecursion(arr, si, ei)); 
    }
}

//Output: 29