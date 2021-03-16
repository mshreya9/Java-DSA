public class WineProblemRecursion {
    public static int WPRecursion(int[] arr, int si, int ei, int yr){
        //Base Case
        if(si == ei){
            return arr[si] * yr;
        }

        int left = WPRecursion(arr, si+1, ei, yr+1) + arr[si]*yr;
        int right = WPRecursion(arr, si, ei-1, yr+1) + arr[ei]*yr;

        int ans = Math.max(left, right);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        System.out.println(WPRecursion(arr, 0, arr.length-1, 1)); 
    }
}

//Output: 50
//TC: O(2 to the power n)