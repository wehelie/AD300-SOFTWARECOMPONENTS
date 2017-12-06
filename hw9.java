package com.company;

class BinaryTree {
    Node root;

    public void add(int data) {
        // create a new node
        Node node = new Node(data);

        if (root == null) {
            root = node;
        }

        searchAndAdd(root, node);
    }

    private void searchAndAdd(Node node, Node nodeToAdd) {
        if (nodeToAdd.data < node.data) {
            if (node.leftChild == null) {
                node.leftChild = nodeToAdd;
            } else {
                searchAndAdd(node.leftChild, nodeToAdd);
            }
        } else if (nodeToAdd.data > node.data) {
            if (node.rightChild == null) {
                node.rightChild = nodeToAdd;
            } else {
                searchAndAdd(node.rightChild, nodeToAdd);
            }
        }
    }

    public void traverse() {
        if (root != null) {
            if (root.leftChild != null && root.leftChild == null) {
                System.out.println(root.data);
            } else {
                inOrder(root);
            }
        }
    }

    private Node locateNode(Node item, Node node) {
        if (item == null) {
            return null;
        }

        if (item.data == node.data) {
            return item;
        } else {
            Node resultNode = locateNode(item.leftChild, node);

            if (resultNode == null) {
                return locateNode(item.rightChild, node);
            }

            return resultNode;
        }
    }

    public Node find(int value) {
        if (root != null) {
            return locateNode(root, new Node(value));
        }

        return null;
    }



    private void inOrder(Node node) {
        System.out.println(node.data);

        if (node.leftChild != null) {
            inOrder(node.leftChild);
        }

        if (node.rightChild != null) {
            inOrder(node.rightChild);
        }
    }
}

class Node {
    int data;
    Node leftChild;
    Node rightChild;


    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}



public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] arr = {18, 14, 20, 22, 36, 57, 61, 21, 79, 60, 81, 95, 90};
        //18, 14, 20, 22, 36, 57, 61, 21, 79, 60, 81, 95, 90
        BinaryTree tree = new BinaryTree();


        // Load a BST using the following numbers and in this order:
        // 18, 14, 20, 22, 36, 57, 61, 21, 79, 60, 81, 95, 90.
        for ( int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }


        //System.out.println(tree);

        tree.traverse();

        int[] query = {14, 95, 90, 35, 17, 63};

        // Search the BST for the following numbers and indicate the depth
        // they are found or when your program determines they are not found.
        // TODO: this is still not complete
        for ( int i = 0; i < query.length; i++) {
           if (tree.find(query[i]) != null) {
               System.out.println("found!");
           } else {
               System.out.println("Not found!");
           }
        }

    }
}
