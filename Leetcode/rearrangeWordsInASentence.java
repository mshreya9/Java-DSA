class Solution {
    public String arrangeWords(String text) {
        StringBuilder sb = new StringBuilder();
        List<Pair> list = new ArrayList<>();
        String[] arr = text.toLowerCase().split(" ");
        for(int i = 0; i < arr.length; i++){
            list.add(new Pair(arr[i], arr[i].length()));
        }
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i).word);
            sb.append(" ");
        }
        
        String str = sb.toString().trim();
        String ans = str.substring(0,1).toUpperCase() + str.substring(1);
        return ans;
    }
}

class Pair implements Comparable<Pair>{
    String word;
    int len;
    
    public Pair(String word, int len){
        this.word = word;
        this.len = len;
    }
    
    public int compareTo(Pair o){
        return this.len - o.len;
    }
}