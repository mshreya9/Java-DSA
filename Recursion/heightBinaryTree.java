import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 

class BinaryTree { 
     Node root; 

    int height(Node node)  
    { 
        if (node == null){ 
            return 0; 
        }
        
        int lh = height(node.left); 
        int rh = height(node.right); 
   
        return 1 + Math.max(lh, rh); 
         
    } 
       
    public static void main(String[] args)  
    { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
   
        System.out.println("Height of tree is : " +  tree.height(tree.root)); 
    } 
} 
//Output : Height of tree is : 3