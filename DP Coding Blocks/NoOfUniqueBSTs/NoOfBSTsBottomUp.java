public class NoOfBSTsBottomUp {
    public static int NoOfBSTsBU(int tn){
        int[] strg = new int[tn+1];
        strg[0] = 1;
        strg[1] = 1;
        for(int n = 2; n < strg.length; n++){
            int total = 0;
            for(int i = 1; i <= n; i++){
                int l = strg[i-1];
                int r = strg[n-i];
                int ans = l * r;
                total += ans;
            }
            strg[n] = total;
        }
        return strg[tn];
    }

    public static void main(String[] args) {
        System.out.println(NoOfBSTsBU(3));
    }
}

//Output: 5