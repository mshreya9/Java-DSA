import java.util.*;

public class countOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String s = "aabaabaa";
        String p = "aaba";

        int k = p.length();
        int i = 0, j = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int m = 0; m < k; m++){
            char ch = p.charAt(m);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        
        int count = map.size();
        int ans = 0; //count of anagrams

        while(j < s.length()){
            //calculation
            char ch = s.charAt(j);
	        if(map.containsKey(ch)){
	            map.put(ch, map.get(ch) - 1);
	            
	            if(map.get(ch) == 0){
	                count--;
	            }
	        }

            //if window size is less than k
            if(j-i+1 < k){
	            j++;
	        }

            else if(j-i+1 == k){
                //will get an answer only if count = 0
                if(count == 0){
                    ans++;
                    System.out.println(s.substring(i, j+1));
                }

                if(map.containsKey(s.charAt(i))){
                    char ch1 = s.charAt(i);
                    map.put(ch1, map.get(ch1) + 1);
                    
                    if(map.get(ch1) == 1){
                        count++;
                    }
                }

                i++;
                j++;
            }
        }
        
        System.out.println(ans);
    }
}

//Output:

// aaba
// abaa
// aaba
// abaa
// 4