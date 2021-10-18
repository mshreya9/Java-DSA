import java.util.*;

public class huffmanEncoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    public huffmanEncoder(String feeder) {
        //1.Create a frequency map of this feeder string
        HashMap<Character, Integer> fmap = new HashMap<>();
        for(int i = 0; i < feeder.length(); i++){
            char cc = feeder.charAt(i);
            if(fmap.containsKey(cc)){
                fmap.put(cc, fmap.get(cc)+1);
            } else{
                fmap.put(cc, 1);
            }
        }

        //2.Create the min heap of nodes
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        Set<Map.Entry<Character, Integer>> entries = fmap.entrySet();
        for(Map.Entry<Character, Integer> entry : entries){
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.add(node);
        }

        //3.Combine nodes until one node is left in heap
        while(minHeap.size() != 1){
            Node minone = minHeap.poll();
            Node mintwo = minHeap.poll();

            Node combined = new Node(minone, mintwo);
            combined.data = '\0';
            combined.cost = minone.cost + mintwo.cost;
            minHeap.add(combined);
        }

        Node fullTree = minHeap.poll();
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(fullTree, "");
    }

    //Filling my Encoder and Decoder
    private void initEncoderDecoder(Node node, String outputSoFar) {
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            this.encoder.put(node.data, outputSoFar);
            this.decoder.put(outputSoFar, node.data);
        }
        this.initEncoderDecoder(node.left, outputSoFar+"0");
        this.initEncoderDecoder(node.right, outputSoFar+"1");
    }

    public String encode(String source){
        String rv = "";
        for(int i = 0; i < source.length(); i++){
            String code = this.encoder.get(source.charAt(i));
            rv = rv + code;
        }
        return rv;
    }

    public String decode(String codedString){
        String rv = "";
        String key = "";
        for(int i = 0; i < codedString.length(); i++){
            key = key + codedString.charAt(i);
            if(this.decoder.containsKey(key)){
                rv = rv + this.decoder.get(key);
                key = "";
            }
        }
        return rv;
    }

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        Node(char data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        Node(Node left, Node right){
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(huffmanEncoder.Node o) {
            // TODO Auto-generated method stub
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        System.out.println("Input String: " + str);
        huffmanEncoder hf = new huffmanEncoder(str);
        String codedString = hf.encode(str);
        System.out.println("Coded String: " + codedString);
        String output = hf.decode(codedString);
        System.out.println("Decoded String: " + output);
    }
}

//Output printed on screen:

// Input String: abbccda
// Coded String: 11010110100011
// Decoded String: abbccda
