package com.algorithm.hackerrank.search.binarySearch;

public class binaryTree {
    static class Node{
        int current;
        Node leftNode;
        Node rightNode;

        Node(int current){
            this.current = current;
        }

        Node(){

        }
    }

    public static Node add(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(node.current < value){
            if(node.rightNode == null){
                node.rightNode = new Node(value);
                return node;
            }
            add(node.rightNode, value);
        }else{
            if(node.leftNode == null){
                node.leftNode = new Node(value);
                return node;
            }
            add(node.leftNode, value);
        }

        return node;
    }

    public static Node delete(Node node, int value){
        if(node == null){
            return node;
        }

        if(node.current < value){
            node.rightNode = delete(node.rightNode, value);
        }else if(node.current > value){
            node.leftNode = delete(node.leftNode, value);
        }else{
            // 현재 노드의 양쪽 다 없는 경우
            if(node.leftNode == null && node.rightNode == null){
                return null;
            }

            // 양쪽 노드 중 한쪽이 없는 경우
            if(node.leftNode == null){
                return node.rightNode;
            }
            if(node.rightNode == null){
                return node.leftNode;
            }

            // 자식이 둘 다 있는 경우.. -> 오른쪽/왼쪽 노드 중 하나를 잡아서 현재 노드에 붙여주면됨
            /*

             */
            node.current = findMin(node.rightNode);
            node.rightNode = delete(node.rightNode, node.current);
        }

        return node;
    }

    private static int findMin(Node node){
        int min = node.current;

        while(node.leftNode != null){
            min = node.leftNode.current;
            node = node.leftNode;
        }

        return min;
    }

    public Node makeNode(Node left, Node right, int data){
        Node node = new Node();
        node.current = data;
        node.leftNode = left;
        node.rightNode = right;

        return node;
    }

    public static void inOrder(Node node){
        if(node != null){
            inOrder(node.leftNode);
            System.out.print(node.current+"-");
            inOrder(node.rightNode);
        }
    }


    public static void preOrder(Node node){

        if(node != null){
            System.out.print(node.current+"-");
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }

    }

    public static void postOrder(Node node){
        if(node != null){
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.print(node.current+"-");
        }
    }

   /*
        inorder (left-root-right)   : 4-2-5-1-3
        preorder (root-left-right)  : 1-2-4-5-3
        postorder (left-right-root) : 4-5-2-3-1
    */

    public static void main(String[] args) {
        Node n = new Node(5);
        add(n, 3);
        add(n, 4);
        add(n, 2);
        add(n, 6);

        inOrder(n);
        System.out.println();
        preOrder(n);
        System.out.println();
        postOrder(n);
    }
}
