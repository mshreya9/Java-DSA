class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int n = 6;

        int z = 0;
        for(int i = 0; i < arr.length; i++){
            z = z ^ arr[i];
        }
        for(int i = 1; i <= n; i++){
            z = z ^ i;
        }
        int setBit = z & ~(z-1);
        int group1 = 0, group2 = 0;
        for(int i = 0; i < arr.length; i++){
            if((arr[i] & setBit) == setBit){
                group1 = group1 ^ arr[i];
            } else {
                group2 = group2 ^ arr[i];
            }
        }
        for(int i = 1; i <= n; i++){
            if((i & setBit) == setBit){
                group1 = group1 ^ i;
            } else {
                group2 = group2 ^ i;
            }
        }

        System.out.println(group1);
        System.out.println(group2);
    }
}

//Output
// 5
// 2