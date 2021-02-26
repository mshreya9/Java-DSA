//Not essentially a question of Backtracking, but it will help in clearing the concepts of Recursion

public class coinChangeCombination {
    public static void main(String[] args) {
        CoinChange(new int[]{2,3,5,6}, 10, "", 0);
    }   

    public static void CoinChange(int[] denom, int amount, String ans, int lastDenomIdx){
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for(int i = lastDenomIdx; i < denom.length; i++){
            if(amount >= denom[i]){
                CoinChange(denom, amount-denom[i], ans+denom[i], i);
            }
        }
    }
}

//Output:

// 22222
// 2233
// 226
// 235
// 55