import java.util.*;

public class countOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String s = "aabaabaa";
        String p = "aaba";

        int k = p.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++){
            char ch = p.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        
        //Initialisations
        int i = 0, j = 0;
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

                //add the count of letter before doing i++
                if(map.containsKey(s.charAt(i))){
                    char ch1 = s.charAt(i);
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
        
        System.out.println(ans);
    }
}

//Output:

// aaba
// abaa
// aaba
// abaa
// 4