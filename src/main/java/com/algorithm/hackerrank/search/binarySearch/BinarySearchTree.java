package com.algorithm.hackerrank.search.binarySearch;

public class BinarySearchTree {
    static class Node{
        int current;
        Node left, right;

        Node(int current){
            this.current = current;
        }
    }

    static class BST{
        private Node node;

        BST(){
            this.node = null;
        }

        public Node add(Node node, int data){
            if(node == null){
                node = new Node(data);
                return node;
            }

            if(node.current < data){
                if(node.right == null){
                    node.right = new Node(data);
                    return node;
                }
                add(node.right, data);
            }else{
                if(node.left ==null){
                    node.left = new Node(data);
                    return node;
                }
                add(node.left, data);
            }

            return node;
        }

        public Node delete(Node node, int data){
            if (node == null){
                return node;
            }

            if(node.current < data){
                node.right = delete(node.right, data);
            }else if(node.current > data){
                node.left = delete(node.left, data);
            }else{
                if(node.left == null && node.right == null){
                    return null;
                }
                if(node.left == null){
                    return node.right;
                }

                if(node.right == null){
                    return node.left;
                }

                node.current = findMin(node.right);
                node.right = delete(node.right, node.current);
            }

            return node;
        }

        private int findMin(Node node) {
            int min = node.current;

            while (node.left != null){
                min = node.left.current;
                node = node.left;
            }

            return min;
        }

        public void add(int data){
            node = add(node, data);
        }
        public void delete(int data){
            node = delete(node, data);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(6);
        bst.add(4);
        bst.add(9);
        bst.add(7);
        bst.add(8);
        bst.add(11);
        bst.add(5);
        bst.add(2);

        bst.delete(4);

        System.out.println(bst.node);
    }
}
