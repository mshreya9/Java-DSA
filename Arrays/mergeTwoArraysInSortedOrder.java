// Problem-2 :- Merge two arrays in a sorted order

import java.util.*;
class CheckMergeArray 
{ 
    public static void mergeArrays(int[] arr1, int[] arr2) 
    {  
      int[] newArray = new int[arr1.length + arr2.length];
      for(int i = 0; i < arr1.length; i++){
        newArray[i] = arr1[i];
      } 
      int newIndex = arr1.length;
      for(int i = 0; i < arr2.length; i++){
        newArray[newIndex++] = arr2[i];
      }
      Arrays.sort(newArray);
      System.out.println(Arrays.toString(newArray));
    } 

    public static void main(String[] args){
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

        CheckMergeArray.mergeArrays(arr1, arr2);
    }

}
