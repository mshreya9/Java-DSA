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
        Vertex vtx1 = vtces.get(vname1); //2k 
        Vertex vtx2 = vtces.get(vname2); //4k

        if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.put(vname2, cost); //2k nbrs put C with a given cost
        vtx2.nbrs.put(vname1, cost); //4k nbrs put A with a given cost
    }

    //Contains Edge
    public boolean containsEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1); //2k address
        Vertex vtx2 = vtces.get(vname2); //4k

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
            return false;
        }
        return true;
    }

    //Remove Edge
    public void removeEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1); //2k 
        Vertex vtx2 = vtces.get(vname2); //4k

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.remove(vname2); 
        vtx2.nbrs.remove(vname1);  
    }

    //Has Path implementation
    public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed){
        //processed HashMap is required to avoid the condition of infinite recursion
        processed.put(vname1, true);

        //direct edge
        if(containsEdge(vname1, vname2)){
            return true;
        }

        //devote the work to the neighbours
        Vertex vtx = vtces.get(vname1); //suppose 2k memory address
        ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet()); //Neighbours of vertex A
        for(String nbr : nbrs){
            if(!processed.containsKey(nbr) && hasPath(nbr, vname2, processed)){
                return true;
            }
        }
        //path does not exist
        return false;
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
        graph.addEdge("A", "D", 3);
        graph.addEdge("B", "C", 1);
        graph.addEdge("C", "D", 8);
        graph.addEdge("D", "E", 10);
        graph.addEdge("E", "F", 18);
        graph.addEdge("E", "G", 7);
        graph.addEdge("F", "G", 8);

        System.out.println(graph.hasPath("A", "F", new HashMap<>())); //true 
        
        graph.removeEdge("D", "E");
        System.out.println(graph.hasPath("A", "F", new HashMap<>())); //false
    }
}

//Output
//true
//false