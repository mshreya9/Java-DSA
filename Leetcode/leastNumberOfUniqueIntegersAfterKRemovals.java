class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        //Basically sorting on the basis of frequencies
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            k = k - list.get(i);
            if(k < 0){
                break;
            } 
            count++;
        }
        
        return map.size() - count;
    }
}


