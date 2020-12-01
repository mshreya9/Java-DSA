import java.util.*;

public class constructTrie {
    private class Node {
        char data;
        HashMap<Character, Node> children;
        boolean isTerminal;

        Node(char data, boolean isTerminal) {
            this.data = data;
            this.children = new HashMap<>();
            this.isTerminal = isTerminal;
        }
    }

    private int numWords;
    private Node root;

    constructTrie(){
        this.root = new Node('\0', false);
        this.numWords = 0;
    }

    public int numWords() {
        return this.numWords;
    }

    public void addWord(String word){
        this.addWord(this.root, word);
    }
    private void addWord(Node parent, String word){
        if(word.length() == 0){
            if(parent.isTerminal){
                //Word already exists 
            }
            else{
                parent.isTerminal = true;
                this.numWords++;
            }
            return;
        }
        char cc = word.charAt(0);
        String restOfString = word.substring(1);
        Node child = parent.children.get(cc);
        if(child == null){
            child = new Node(cc, false);
            parent.children.put(cc, child);
        }
        this.addWord(child, restOfString);
    }

    public void display() {
        this.display(this.root, "");
    }

    private void display(Node node, String outputSoFar){
        if(node.isTerminal){
            String todisplay = outputSoFar.substring(1) + node.data;
            System.out.println(todisplay);
        }
        Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
        for(Map.Entry<Character, Node> entry : entries){
            this.display(entry.getValue(), outputSoFar+node.data);
        }
    }

    public boolean search(String word){
        return this.search(this.root, word);
    }

    private boolean search(Node parent, String word){
        if(word.length() == 0){
            if(parent.isTerminal){
                return true;
            }
            else{
                return false;
            }
        }
        char cc = word.charAt(0);
        String restOfString = word.substring(1);
        Node child = parent.children.get(cc);
        if(child == null){
            return false;
        }
        return this.search(child, restOfString);
    }

    public void remove(String word){
        this.remove(this.root, word);
    }

    private void remove(Node parent, String word){
        if(word.length() == 0){
            if(parent.isTerminal){
                parent.isTerminal = false;
                this.numWords--;
            }
            else{
                //word is a part of some other word
            }
            return;
        }
        char cc = word.charAt(0);
        String restOfString = word.substring(1);
        Node child = parent.children.get(cc);
        if(child == null){
            return;
        }
        this.remove(child, restOfString);

        if(!child.isTerminal && child.children.size() == 0){
            parent.children.remove(cc);
        }
    }
    public static void main(String[] args) {
        constructTrie trie = new constructTrie();
        trie.addWord("art");
        trie.addWord("arts");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("sea");
        trie.addWord("seen"); 
        trie.addWord("see"); 
        trie.addWord("amit");
        trie.display();

        System.out.println("***************");

        System.out.println(trie.search("art"));
        System.out.println(trie.search("arts"));
        System.out.println(trie.search("saw"));

        System.out.println("***************");

        trie.remove("arts");
        trie.remove("art");
        trie.display();

        System.out.println(trie.numWords);
    }
}

//output:
// art
// arts
// amit
// bug
// boy
// sea
// see
// seen
// ***************
// true
// true
// false
// ***************
// amit
// bug
// boy
// sea
// see
// seen
// 6