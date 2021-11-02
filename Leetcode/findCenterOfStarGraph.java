class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < edges[i].length; j++){
                if(map.containsKey(edges[i][j])){
                    map.put(edges[i][j], map.get(edges[i][j]) + 1);
                } else{
                    map.put(edges[i][j], 1);
                }
            }
        }
        
        for(Integer i : map.keySet()){
            if(map.get(i) == edges.length){
                return i;
            }
        }
        
        return 0;
    }
}