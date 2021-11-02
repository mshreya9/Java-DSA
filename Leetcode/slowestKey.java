class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        List<Pair> list = new ArrayList<>();
        list.add(new Pair(keysPressed.charAt(0), releaseTimes[0]));
        for(int i = 1; i < releaseTimes.length; i++){
            list.add(new Pair(keysPressed.charAt(i), releaseTimes[i] - releaseTimes[i-1]));
        }
                
        Collections.sort(list);
        
        return list.get(list.size()-1).key;
    }
}

class Pair implements Comparable<Pair> {
    char key;
    int duration;
    
    public Pair(char key, int duration){
        this.key = key;
        this.duration = duration;
    }
    
    public int compareTo(Pair o){
        if(this.duration == o.duration){
            return this.key - o.key;
        }
        return this.duration - o.duration;
    }
}