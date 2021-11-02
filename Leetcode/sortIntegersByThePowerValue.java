class Solution {
    public int getKth(int lo, int hi, int k) {
        List<Pair> list = new ArrayList<>();
        for(int i = lo; i <= hi; i++){
            int power = getPower(i);
            list.add(new Pair(i, power));
        }
        Collections.sort(list);
        return list.get(k-1).number;
    }
    
    public int getPower(int x){
        int count = 0;
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            } else{
                x = 3 * x + 1;
            }
            count++;
        }
        return count;
    }
}

class Pair implements Comparable<Pair>{
    int number;
    int power;
    
    public Pair(int number, int power) {
        this.number = number;
        this.power = power;
    }
    
    @Override
	public int compareTo(Pair o) {
		return this.power - o.power;
	}
}