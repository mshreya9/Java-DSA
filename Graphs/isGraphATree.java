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

    // Constructor
    public Graph() {
        vtces = new HashMap<>();
    }

    // Add vertex
    public void addVertex(String vname) {
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    // Add Edge
    public void addEdge(String vname1, String vname2, int cost) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
            return;
        }

        vtx1.nbrs.put(vname2, cost);
        vtx2.nbrs.put(vname1, cost);
    }

    private class Pair {
        String vname;
        String pathsofar;
    }

    // Check if graph is cyclic
    public boolean isCyclic() {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // For every vertex repeat the process
        for (String key : keys) {

            // if graph is disconncted (If DE edge is not present)
            if (processed.containsKey(key)) {
                continue;
            }

            // create a new pair
            Pair sp = new Pair();
            sp.vname = key;
            sp.pathsofar = key;

            // put the new pair in queue
            queue.addLast(sp);

            // while queue is not empty, keep on doing the work
            while (!queue.isEmpty()) {

                // remove a pair from queue
                Pair rp = queue.removeFirst();

                if (processed.containsKey(rp.vname)) {
                    return true; // graph is cyclic
                }

                // add to processed HashMap
                processed.put(rp.vname, true);

                // nbrs hash map
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                // loop on nbrs
                for (String nbr : nbrs) {
                    // process only unprocessed nbrs
                    if (!processed.containsKey(nbr)) {

                        // make a new pair of nbr and put in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.pathsofar = rp.pathsofar + nbr;

                        queue.addLast(np);
                    }
                }
            }
        }
        return false;
    }

    // Check if graph is connected
    public boolean isConnected() {
        int flag = 0;
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // For every vertex repeat the process
        for (String key : keys) {

            // if graph is disconncted (If DE edge is not present)
            if (processed.containsKey(key)) {
                continue;
            }

            flag++;

            // create a new pair
            Pair sp = new Pair();
            sp.vname = key;
            sp.pathsofar = key;

            // put the new pair in queue
            queue.addLast(sp);

            // while queue is not empty, keep on doing the work
            while (!queue.isEmpty()) {

                // remove a pair from queue
                Pair rp = queue.removeFirst();

                if (processed.containsKey(rp.vname)) {
                    continue; // move to next iteration if vname in Pair is duplicated
                }

                // add to processed HashMap
                processed.put(rp.vname, true);

                // nbrs hash map
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                // loop on nbrs
                for (String nbr : nbrs) {
                    // process only unprocessed nbrs
                    if (!processed.containsKey(nbr)) {

                        // make a new pair of nbr and put in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.pathsofar = rp.pathsofar + nbr;

                        queue.addLast(np);
                    }
                }
            }
        }
        if (flag >= 2) {
            return false;
        }
        return true;
    }

    // is graph a tree
    public boolean isTree() {
        return !isCyclic() && isConnected();
    }
}

class GraphUse {
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

        System.out.println(graph.isTree());
    }
}

// Output
//false
