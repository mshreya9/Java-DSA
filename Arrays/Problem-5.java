// Find minimum and maximum values in an array

import java.util.*;

class CheckMinAndMax {

    public static void findMinMax(int[] arr) {
      int minimum = Integer.MAX_VALUE;
      for(int i = 1; i < arr.length; i++){
          if(arr[i] < minimum){
            minimum = arr[i];
          }
      } 
      System.out.println("The minimum number in an array is: " + minimum);

      int maximum = Integer.MIN_VALUE;
      for(int i = 1; i < arr.length; i++){
          if(arr[i] > maximum){
            maximum = arr[i];
          }
      } 
      System.out.println("The maximum number in an array is: " + maximum);
    }

    public static void main(String[] args){
        int[] arr = {9, 2, 3, 6, 1, 12, 32};
        CheckMinAndMax.findMinMax(arr);
    }
  }