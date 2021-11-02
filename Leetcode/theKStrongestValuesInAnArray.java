class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int l = (arr.length-1) / 2;
        int m = arr[l];
        
        List<Pair> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(new Pair(arr[i], Math.abs(arr[i]-m)));
        }
        
        Collections.sort(list);
        
        //How to print an an arraylist with type Pair class?
        // for(int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        // }
        
        int[] ans = new int[k];
        for(int i = 0; i < list.size(); i++){
            if(k == 0){
                break;
            }
            ans[i] = list.get(i).num1;
            k--;
        }
        
        return ans;
        
    }
}

class Pair implements Comparable<Pair> {
    int num1; //arr[i]
    int num2; //arr[i] - m
    
    public Pair(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
    public int compareTo(Pair o){
        if(this.num2 == o.num2){
            return o.num1 - this.num1;
        }
        
        return o.num2 - this.num2;
    }
    
//     public int getKey() {
//         return num1;
//     }
    
//     public int getValue() {
//         return num2;
//     }
    
}