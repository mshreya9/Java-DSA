/*Find the maximum difference in array such that larger element appears after the smaller number.
The same exact question is asked in VISA online coding round for summer internship.
O(N^2) approach would give TLE, so need to write an efficient solution.
*/

public class maximumDifferenceInArray {
    public static int maxDifference(int arr[]){ 
        int n = arr.length;
        int maxDiff = arr[1] - arr[0]; 
        int minElem = arr[0]; 
        for(int i = 1; i < n; i++){ 
            if(arr[i] - minElem > maxDiff){
                maxDiff = arr[i] - minElem; 
            }
            if(arr[i] < minElem){
                minElem = arr[i];
            }
        } 
        return maxDiff; 
    }
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDifference(arr));
    }
}

//Output
//2
