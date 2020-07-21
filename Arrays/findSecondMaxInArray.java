// Problem-7 :- Find second maximum value in an array

import java.util.*;

class SecondMax {
  
    public static void findSecondMaximum(int[] arr)
    {
      int max = Integer.MIN_VALUE;
      int secondmax = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
      }
  
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > secondmax && arr[i] != max){
          secondmax = arr[i];
        }
      }
      System.out.println("Second maximum number in the array is: " + secondmax);
    }

    public static void main(String[] args){
        int[] arr = {9, 2, 3, 6};
        SecondMax.findSecondMaximum(arr);
    }
  }