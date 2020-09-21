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

    // Contains Edge
    public boolean containsEdge(String vname1, String vname2) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);

        if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
            return false;
        }
        return true;
    }

    private class Pair {
        String vname;
        String pathsofar;
    }

    // DFT implementation
    public void dft() {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();

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

            // put the new pair in stack
            stack.addFirst(sp);

            // while stack is not empty, keep on doing the work
            while (!stack.isEmpty()) {

                // remove a pair from stack
                Pair rp = stack.removeFirst();

                if (processed.containsKey(rp.vname)) {
                    continue; // move to next iteration if vname in Pair is duplicated
                }

                // add to processed HashMap
                processed.put(rp.vname, true);

                System.out.println(rp.vname + " via " + rp.pathsofar);

                // nbrs hash map
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                // loop on nbrs
                for (String nbr : nbrs) {
                    // process only unprocessed nbrs
                    if (!processed.containsKey(nbr)) {

                        // make a new pair of nbr and put in stack
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.pathsofar = rp.pathsofar + nbr;

                        stack.addFirst(np);
                    }
                }
            }
        }
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

        graph.dft();
    }
}

// Output

// A via A
// D via AD
// E via ADE
// G via ADEG
// F via ADEGF
// C via ADC
// B via ADCB
