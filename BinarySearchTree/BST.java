public class BST {
    class Node{
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = right = null;
        }

    }
    Node insertKey(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.value)
            root.left = insertKey(root.left, value);
        else if (value>root.value)
            root.right = insertKey(root.right, value);
        return root;
    }
    void inorder(){

    }

}
