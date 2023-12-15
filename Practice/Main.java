package Practice;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        
        head.left.left = new Node(4);
        head.left.right = new Node(5);

        head.right.left = new Node(6);
        head.right.right = new Node(7);

        BinaryTree tree = new BinaryTree(head);
        tree.preOrder(head);
        System.out.println();
        tree.inOrder(head);
        System.out.println();
        tree.postOrder(head);
    }
}

