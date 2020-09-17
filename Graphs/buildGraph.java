//Implementation of Graph

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

    //Number of vertices
    public int numVertex(){
        return this.vtces.size();
    }

    //Contains vertex
    public boolean containsVertex(String vname){
        return this.vtces.containsKey(vname);
    }

    //Add vertex
    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    //Remove vertex
    public void removeVertex(String vname){
        Vertex vtx = vtces.get(vname);
        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
        for(String key : keys){
            Vertex nbrVtx = vtces.get(key);
            nbrVtx.nbrs.remove(vname);
        }
        vtces.remove(vname);
    }

    //Number of edges in graph
    public int numEdges(){
        int count = 0;
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for(String key : keys){
            Vertex vtx = vtces.get(key);
            count += vtx.nbrs.size();
        }
        return count/2;
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

    //Remove Edge
    public void removeEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1); //2k 
        Vertex vtx2 = vtces.get(vname2); //4k

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
            return;
        }

        vtx1.nbrs.remove(vname2); //2k nbrs remove C 
        vtx2.nbrs.remove(vname1); //4k nbrs remove A 
    }

    //Display graph
    public void display(){
        System.out.println("------------------");
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for(String key : keys){
            Vertex vtx = vtces.get(key);
            System.out.println(key + ":" + vtx.nbrs); //HashMap gets printed directly
        }
        System.out.println("------------------");
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

        graph.display();

        System.out.println(graph.containsEdge("E", "C")); //false

        graph.removeVertex("F");
        graph.display();
    }
}

//Output

// ------------------
// A:{B=2, D=3}
// B:{A=2, C=1}
// C:{B=1, D=8}
// D:{A=3, C=8, E=10}
// E:{D=10, F=18, G=7}
// F:{E=18, G=8}
// G:{E=7, F=8}
// ------------------

//false

// ------------------
// A:{B=2, D=3}
// B:{A=2, C=1}
// C:{B=1, D=8}
// D:{A=3, C=8, E=10}
// E:{D=10, G=7}
// G:{E=7}
// ------------------