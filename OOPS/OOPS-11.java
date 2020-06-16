//Generic Methods

class Solution {

    public static<T> void printArray(T a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        for(int i = 0; i < 5; i++){
            arr[i] = i + 1;
        }
        printArray(arr);
        //1 2 3 4 5

        String[] s = new String[5];
        for(int i = 0; i < 5; i++){
            s[i] = "Shr";
        }
        printArray(s);
        //Shr Shr Shr Shr Shr
    }
}