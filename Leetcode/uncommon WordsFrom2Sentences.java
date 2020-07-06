class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : A.split(" ")){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        
        for(String word : B.split(" ")){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        
        List<String> list = new ArrayList<>();
        for(String word : map.keySet()){
            if(map.get(word) == 1){
                list.add(word);
            }
        }
        
        String[] str = new String[list.size()];
        return list.toArray(str);
    }
}