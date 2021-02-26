//Not essentially a question of Backtracking, but it will help in clearing the concepts of Recursion

public class coinChangePermutation {
    static int count = 0;
    public static void main(String[] args) {
        CoinChangeP(new int[]{2,3,5,6}, 10, "");
    }   

    public static void CoinChangeP(int[] denom, int amount, String ans){
        if(amount == 0){
            count++;
            System.out.println(count + ". " + ans);
            return;
        }

        for(int i = 0; i < denom.length; i++){
            if(amount >= denom[i]){
                CoinChangeP(denom, amount-denom[i], ans+denom[i]);
            }
        }
    }
}

//Output:

// 1. 22222
// 2. 2233
// 3. 226
// 4. 2323
// 5. 2332
// 6. 235
// 7. 253
// 8. 262
// 9. 3223
// 10. 3232
// 11. 325
// 12. 3322
// 13. 352
// 14. 523
// 15. 532
// 16. 55
// 17. 622