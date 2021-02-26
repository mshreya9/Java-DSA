public class coinChangeCoinRespect {
    public static void main(String[] args) {
        CoinChangeWRTCoin(new int[]{2,3,5,6}, 0, 10, "");
    }

    public static void CoinChangeWRTCoin(int[] denom, int vidx, int amount, String ans){
        //Base Case
        //Positive Base Case
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        //Negative Base Case
        if(amount < 0 || vidx == denom.length){
            return;
        }

        //Contribution of denom[i] to the amount
        CoinChangeWRTCoin(denom, vidx, amount-denom[vidx], ans+denom[vidx]);

        //No contribution of denom[i] to the amount
        CoinChangeWRTCoin(denom, vidx+1, amount, ans);
    }
}

//Output:

// 22222
// 2233
// 226
// 235
// 55