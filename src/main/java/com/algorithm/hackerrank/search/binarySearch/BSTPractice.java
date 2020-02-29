package com.algorithm.hackerrank.search.binarySearch;

public class BSTPractice {
    class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    Node root;

    public Node find(Node root, int key){
        if(root == null || root.data == key){
            return root;
        }

        if(root.data > key){
            return find(root.left, key);
        }else{
            return find(root.right, key);
        }
    }


    public void add(int data){
        root = add(root, data);
    }

    private Node add(Node root, int data) {
        if(root == null){
            this.root = new Node(data);

            return root;
        }

        if(root.data < data){
            root.right = add(root.right, data);
        }else{
            root.left = add(root.left, data);
        }

        return root;
    }


}