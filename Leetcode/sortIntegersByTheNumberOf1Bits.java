class Solution {
    public int[] sortByBits(int[] arr) {
        List<Pair> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count = noOf1Bits(arr[i]);
            list.add(new Pair(arr[i], count));
        }
        
        Collections.sort(list);
        
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[i] = list.get(i).number;
        }
        
        return ans;
    }
    
    public int noOf1Bits(int n){
        int count = 0;
        String s = Integer.toBinaryString(n);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        
        return count;
    }
}

class Pair implements Comparable<Pair> {
    int number;
    int count;
    
    public Pair(int number, int count){
        this.number = number;
        this.count = count;
    }
    
    public int compareTo(Pair o){
        if(this.count == o.count){
            return this.number - o.number;
        }
        return this.count - o.count;
    }
}