//Graph for reference -->

// A-----------------D-----------E
// |                 |           | -
// |                 |           |  -
// |                 |           |   -
// |                 |           |    -
// |                 |           |     -
// B-----------------C           F------G   

import java.util.*;

class Graph {
    private class Vertex {
        HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertex> vtces;

    //Constructor
    public Graph(){
        vtces = new HashMap<>();
    }

    //Add vertex
    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    //Add Edge
    public void addEdge(String vname1, String vname2, int cost){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2); 

        if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.put(vname2, cost); 
        vtx2.nbrs.put(vname1, cost); 
    }

    //Display graph
    public void display(){
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for(String key : keys){
            Vertex vtx = vtces.get(key);
            System.out.println(key + ":" + vtx.nbrs); //HashMap gets printed directly
        }
    }

    //Pair class
    private class Pair implements Comparable<Pair>{
        String vname;
        String psf;
        int cost;

        @Override
        public int compareTo(Pair o){
            return o.cost-this.cost;
        }
    }

    public HashMap<String, Integer> dijkstra(String src){
        HashMap<String, Integer> ans = new HashMap<>();
        HashMap<String, Pair> map = new HashMap<>();

        //HeapGeneric<Pair> heap = new HeapGeneric<>();
        //creating a min heap
        PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.cost - a.cost;
                }
            }
        );

        //make a pair and put in heap and map
        for(String key : vtces.keySet()){
            Pair np = new Pair();
            np.vname = key;
            np.psf = "";
            np.cost = Integer.MAX_VALUE;

            if(key.equals(src)){
                np.psf = key;
                np.cost = 0;
            }
            heap.add(np);
            map.put(key, np);
        }

        //till the heap is not empty keep on removing the pairs
        while(heap.isEmpty()){
            //remove a pair
            Pair rp = heap.remove();
            map.remove(rp.vname);

            //add to ans
            ans.put(rp.vname, rp.cost);

            //nbrs
            for(String nbr : vtces.get(rp.vname).nbrs.keySet()){

                //work for nbrs which are in heap
                if(map.containsKey(nbr)){
                    int oldcost = map.get(nbr).cost;
                    int newcost = rp.cost + vtces.get(rp.vname).nbrs.get(nbr);

                    //update the pair only when newcost < oldcost
                    if(newcost < oldcost){
                        Pair getpair = map.get(nbr);
                        getpair.psf = rp.psf + nbr;
                        getpair.cost = newcost;
                        heap.updatePriority(getpair);
                    }
                }
            }
        }

        return ans;
    }
}

class GraphUse{
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "D", 10);
        graph.addEdge("B", "C", 3);
        graph.addEdge("C", "D", 1);
        graph.addEdge("D", "E", 8);
        graph.addEdge("E", "F", 5);
        graph.addEdge("E", "G", 6);
        graph.addEdge("F", "G", 4);

        System.out.println(graph.dijkstra("A"));

    }
}


 