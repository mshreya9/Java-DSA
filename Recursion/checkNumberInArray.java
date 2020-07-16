class Solution {
    static int recSearch(int arr[], int l, int r, int x) {
        if (r < l)
            return -1;
        if (arr[l] == x)
            return l;
        if (arr[r] == x)
            return r;
        return recSearch(arr, l + 1, r - 1, x);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10}; 
        int x = 3;

        // Method call to find x
        int index = recSearch(arr, 0, arr.length - 1, x);
        if (index != -1)
            System.out.println("Element " + x + " is present at index " + index);
        else
            System.out.println("Element " + x + " is not present");
    }
}
