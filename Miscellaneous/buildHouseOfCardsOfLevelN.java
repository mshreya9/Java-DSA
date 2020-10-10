class Solution {
    public static void main(String args[]) {
        int n = 3;
        System.out.println(noOfCards(n));
    }

    public static int noOfCards(int n){
        int reqCards = n * (n*3 + 1) / 2;
        return reqCards;
    }
}

//Output: 15