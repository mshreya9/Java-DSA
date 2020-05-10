// Problem-9 :- Rearrange positive and negative values  

import java.util.*;

class CheckReArrange {

  public static void reArrange(int[] arr) {
  
    //   //Creating a new array for all the negative values 
    //   int negcount = 0;
    //   for(int i = 0; i < arr.length; i++){
    //     if(arr[i] < 0){
    //       negcount++;
    //     }
    //   } 
    //   int[] negArray = new int[negcount];
    //   int negIndex = 0;
    //   for(int i = 0; i < arr.length; i++){
    //     if(arr[i] < 0){
    //         negArray[negIndex++] = arr[i];
    //     }
    //   }      
  
    //   //Creating a new array for all the positive values
    //   int poscount = 0;
    //   for(int i = 0; i < arr.length; i++){
    //     if(arr[i] > 0){
    //       poscount++;
    //     }
    //   } 
    //   int[] posArray = new int[poscount];
    //   int posIndex = 0;
    //   for(int i = 0; i < arr.length; i++){
    //     if(arr[i] > 0){
    //         posArray[posIndex++] = arr[i];
    //     }
    //   }

    //   //Now merge both the arrays
    //   for(int i = 0; i < negArray.length; i++){
    //     arr[i] = negArray[i];
    //   }
    //   int newIndex = negArray.length;
    //   for(int i = 0; i < posArray.length; i++){
    //     arr[newIndex++] = posArray[i];
    //   }
    //   System.out.println(Arrays.toString(arr));


    int[] newArray = new int[arr.length];
    int index = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            newArray[index++] = arr[i];
        }
    }
    int in = index;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > 0){
            newArray[in++] = arr[i];
        }
    }
    System.out.println(Arrays.toString(newArray));
  }
      

  public static void main(String[] args) {
    int[] arr = { 10, -1, 20, 4, 5, -9, -6 };
    CheckReArrange.reArrange(arr);
  }
}