class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int k = p.length();
        
        //create map for string p
        for(int i = 0; i < k; i++){
            char ch = p.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        
        //initialisations
        int i = 0, j = 0;
        int count = map.size();
        
        while(j < s.length()){
            //calculation
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) == 0){
                    count--;
                }
            }
            
            // when we haven't reached the window size yet
            if(j-i+1 < k){
                j++;
            } 
            
            else if(j-i+1 == k){
                //we will get answer only when count is 0
                if(count == 0){
                    ans.add(i);
                }
                
                //Restore the calculation for i
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1) + 1);
                    
                    if(map.get(ch1) == 1){
                        count++;
                    }
                }

                //slide
                i++;
                j++;
            }
        }

        return ans;
    }
}