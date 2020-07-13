class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++){
            int minCount = Integer.MAX_VALUE;
            for(String s : A){
                int wordCount = 0;
                for(char curr : s.toCharArray()){
                    if (curr == c){ 
                        wordCount++;
                    }
                }
                minCount = Math.min(minCount, wordCount);
            }
            
            for (int i = 0; i < minCount; i++){
                list.add("" + c);
            }
        }
        return list;
    }
}