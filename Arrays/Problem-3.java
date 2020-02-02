// Problem-3 Find two numbers that add up to n
//Solve it usinh hash set for least time complexity

import java.util.*;

class CheckSum{   
    public static void findSum(int[] arr, int n) 
    {
      int[] result = new int[2];
      Set<Integer> set = new HashSet<Integer>();
      for(int i: arr) 
      {
        if(set.contains(n - i)){
            result[0] = i;
            result[1] = n - i;
            break;
        }
        set.add(i);
      }
      System.out.println(Arrays.toString(result)); 
    }
    
    public static void main(String[] args){
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int n = 27;
        CheckSum.findSum(arr, n);
    }
}
  