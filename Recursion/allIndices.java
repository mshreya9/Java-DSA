import java.util.*;

class Solution {
    public static int[] allIndices(int[] arr, int si, int data, int count){
        if(si == arr.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si] == data){
            indices = allIndices(arr, si+1, data, count+1);
        } else{
            indices = allIndices(arr, si+1, data, count);
        }
        if(arr[si] == data){
            indices[count] = si;
        }
        return indices;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,4};
        int data = 8;
        int[] ans = allIndices(arr, 0, data, 0);
        display(ans);
    }
}

//Output
//1 3 4 