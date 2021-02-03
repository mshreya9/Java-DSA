class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        for(char letter: allowed.toCharArray()){
            set.add(letter);
        }

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++)
            {
                if(!set.contains(words[i].charAt(j))){
                    break;
                }

                if(j == words[i].length() -1)
                {
                    count++;
                }
            }
        }

        return count;
    }
}