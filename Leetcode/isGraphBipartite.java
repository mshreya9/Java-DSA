class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for(int i = 0; i < graph.length;i++){
            if(color[i] == -1)
                if(!bfsCheck(graph, i, color))
                    return false;
        }
        
        return true;
    }
    
    public boolean bfsCheck(int[][] graph, int node, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;
        while(! q.isEmpty()){
            int temp = q.poll();
            for(int i = 0; i < graph[temp].length; i++){
                int ele = graph[temp][i];
                if(color[ele] == -1){
                    color[ele] = 1-color[temp];
                    q.add(ele);
                } else if(color[ele] == color[temp])
                    return false;
            }
        }
        return true;
    }
}