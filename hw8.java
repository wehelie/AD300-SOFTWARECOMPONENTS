public class BinaryTree {

    // Tree Node
    public static class Node {

        int data;

        Node left;

        Node right;

        // constructor function
        Node(int data) {

            this.data = data;

        }

    }

    // Tree Traversals (Preorder)
    public void PreOrder(Node root) {

        if ( root == null) {

            return;

        } else {

            System.out.print(" " + root.data);

            PreOrder(root.left);

            PreOrder(root.right);

        }
    }

    public static Node createBinaryTree() {

        Node root  = new Node(40);
        Node node2 = new Node(90);
        Node node3 = new Node(10);
        Node node4 = new Node(30);
        Node node5 = new Node(60);
        Node node6 = new Node(50);
        Node node7 = new Node(70);

        root.left = node2;
        root.right = node5;

        node2.left = node3;
        node2.right = node4;

        node5.left = node6;
        node5.right = node7;

        return root;
    }

    public static void main(String[] args) {

        System.out.println("Tree Traversals (Preorder)");
        // instaiantate the Binary Tree Object
        BinaryTree BT = new BinaryTree();

        // Create the Root of the Tree Node
        Node root = createBinaryTree();

        BT.PreOrder(root);
    }
}
