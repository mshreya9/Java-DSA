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


    //Information needed
    private class EdgePair implements Comparable<EdgePair>{
        String v1;
        String v2;
        int cost;

        @Override
        public int compareTo(EdgePair o){
            return this.cost - o.cost;
        }

        public String toString(){
            return v1 + "-" + v2 + " : " + cost;
        }
    }

    //We need all edges so that we can sort them while writing kruskal's code
    public ArrayList<EdgePair> getAllEdges(){
        ArrayList<EdgePair> edges = new ArrayList<>();
        for(String vname : vtces.keySet()){
            Vertex vtx = vtces.get(vname);
            for(String nbr : vtx.nbrs.keySet()){
                EdgePair ep = new EdgePair();
                ep.v1 = vname;
                ep.v2 = nbr;
                ep.cost = vtx.nbrs.get(nbr);

                edges.add(ep);
            }
        }
        return edges;
    }


    //Kruskal 
    public void kruskal() {

        //sort the edges in increasing order of cost
        ArrayList<EdgePair> edges = getAllEdges();
        Collections.sort(edges);

        DisjointSet set = new DisjointSet();

        //create vertices no of sets
        for(String vname : vtces.keySet()){
            set.create(vname);
        }

        //traverse over the edges
        for(EdgePair edge : edges){
            String re1 = set.find(edge.v1);
            String re2 = set.find(edge.v2);

            //re same : ignore
            if(re1.equals(re2)){
                continue;
            } else{
                System.out.println(edge);
                set.union(edge.v1, edge.v2);
            }
        }
    }
    
}


//Disjoint Set
class DisjointSet{

    HashMap<String, Node> map = new HashMap<>();

    private class Node{
        String data;
        Node parent;
        int rank;
    }

    public void create(String value){
        Node newnode = new Node();
        newnode.data = value;
        newnode.parent = newnode;
        newnode.rank = 0;

        map.put(value, newnode);
    }

    public void union(String value1, String value2){
        Node n1 = map.get(value1);
        Node n2 = map.get(value2);

        Node re1 = find(n1);
        Node re2 = find(n2);

        if(re1.data.equals(re2.data)){
            return;
        } else{
            //union code
            if(re1.rank == re2.rank){
                re2.parent = re1;
                re1.rank = re1.rank + 1;
            } else if(re1.rank > re2.rank){
                re2.parent = re1;
            } else{
                re1.parent = re2;
            }
        } 
    }

    public String find(String value){
        return find(map.get(value)).data;
    }

    public Node find(Node node){
        if(node == node.parent){
            return node;
        }
        Node recresult = find(node.parent);
        return recresult;
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

        graph.kruskal();

    }
}


//Output

// C-D : 1
// A-B : 2
// B-C : 3
// F-G : 4
// E-F : 5
// D-E : 8