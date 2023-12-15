package Practice;

public class BinaryTree {
    Node head;

    public BinaryTree(){
        head = null;
    }

    public BinaryTree(Node node){
        this.head = node;
    }
 
    public void preOrder(Node head){
        if(head == null) return ;
        System.out.print(head .val + " ");
        preOrder(head.left);
        preOrder(head.right);
    }

    public void inOrder(Node head){
        if(head == null) return ;
        inOrder(head.left);
        System.out.print(head.val + " ");
        inOrder(head.right);
    }

    public void postOrder(Node head){
        if(head == null) return ;
        postOrder(head.left);
        postOrder(head.right);
        System.out.print(head.val + " ");
    }
}

class Node{
    int val;
    Node left;
    Node right;

    public Node(int data){
        this.val = data;
        left = null;
        right = null;
    }
}

