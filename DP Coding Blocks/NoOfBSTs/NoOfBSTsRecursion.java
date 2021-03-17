public class NoOfBSTsRecursion {
    public static int NoOfBSTsRecursive(int n){
        //Base Case
        if(n <= 1){
            return 1; //very imp
        }

        int total = 0;
        for(int i = 1; i <= n; i++){
            int l = NoOfBSTsRecursive(i-1);
            int r = NoOfBSTsRecursive(n-i);
            int ans = l * r;
            total += ans;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(NoOfBSTsRecursive(3));
    }
}

//Output: 5