class Solution {
    public int numFriendRequests(int[] ages) {
        int req = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ages.length; i++){
            if(map.containsKey(ages[i])){
                map.put(ages[i], map.get(ages[i])+1);
            } else{
                map.put(ages[i], 1);
            }
        }
        
        for(Integer a : map.keySet()){
            for(Integer b :  map.keySet()){
                if(request(a, b)){
                    if(a == b){
                        req += map.get(a) * (map.get(a) - 1);
                    } else{
                        req += map.get(a) * map.get(b);
                    }
                }
            }
        }
        
        return req;
    }
    
     private boolean request(int a, int b){
        return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
    }
}