import java.util.*;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String s = "timetopractice";
        String t = "toc";

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            } else {
                map.put(t.charAt(i), 1);
            }
        }
        
        int count = map.size();
        int i = 0, j = 0, minlen = Integer.MAX_VALUE, minleft = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
	        if(map.containsKey(ch)){
	            map.put(ch, map.get(ch) - 1);
	            
	            if(map.get(ch) == 0){
	                count--;
	            }
	        }

            while(count == 0){
                if(j-i+1 < minlen){
                    minlen = j-i+1;
                    minleft = i;
                }
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1) + 1);

                    if(map.get(ch1) == 1){
                        count++;
                    }
                }
                i++;
            }
            j++; 
        }
        
        if(minlen == Integer.MAX_VALUE) {
            System.out.println("");
        }
        
        System.out.println(s.substring(minleft, minleft + minlen));
    }
}

//Output: toprac