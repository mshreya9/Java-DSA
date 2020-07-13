class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int temp = 0;
        int max = -1;
        for(Integer i : map.keySet()){
            if(map.get(i) == i){
                temp = i;
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }
}