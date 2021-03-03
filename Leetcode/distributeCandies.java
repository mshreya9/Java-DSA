class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        int allowed = candyType.length / 2;
        return (allowed < set.size()) ? allowed : set.size();
    }
}