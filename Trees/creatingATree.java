import java.util.*;

class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
class TreeUse {
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n;
        System.out.println("Enter next node data");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for  " + n);
        int childCount = sc.nextInt();
        for(int i = 0; i < childCount; i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }
        return root; 
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for(int i = 0; i < root.children.size(); i++){
            if(i == root.children.size()-1){
                s = s + root.children.get(i).data;
                break;
            }
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i = 0; i < root.children.size(); i++){
            print(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        print(root);
    }
}

//Input : 4 3 2 0 1 2 5 0 6 0 3 0
//Output: 
// 4:2,1,3
// 2:
// 1:5,6
// 5:
// 6:
// 3: