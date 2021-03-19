public class NoOfBSTsTopDown {
    public static int NoOfBSTsTD(int n, int[] strg){
        //Base Case
        if(n <= 1){
            return 1; //very imp
        }

        if(strg[n] != 0){
            return strg[n];
        }

        int total = 0;
        for(int i = 1; i <= n; i++){
            int l = NoOfBSTsTD(i-1, strg);
            int r = NoOfBSTsTD(n-i, strg);
            int ans = l * r;
            total += ans;
        }

        strg[n] = total;
        return total;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] strg = new int[n+1];
        System.out.println(NoOfBSTsTD(n, strg));
    }
}

//Output: 5