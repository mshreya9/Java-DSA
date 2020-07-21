// Problem-8 :- Right Roatate the Array by One Index

import java.util.*;

class CheckRotateArray{
  
    public static void rotateArray(int[] arr){
  
          int last = arr[arr.length - 1];
          for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
          }
          arr[0] = last;

          System.out.println(Arrays.toString(arr));
      }
      public static void main(String[] args){
          int[] arr = {1, 2, 3, 4, 5};
          CheckRotateArray.rotateArray(arr);
      }
  }