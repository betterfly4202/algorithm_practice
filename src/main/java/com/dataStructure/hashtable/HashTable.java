package com.dataStructure.hashtable;

import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * Created by betterfly
 * Date : 2019.09.01
 */
public class HashTable {
    class Node{
        String key;
        String value;

        Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        String getValue(){
            return value;
        }
        void setValue(String value){
            this.value = value;
        }
    }

    LinkedList<Node> [] hashList;

    private HashTable(int size){
        this.hashList = new LinkedList[size];
    }

    public int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            hashCode += c;
        }

        return hashCode;
    }

    public int convertToIndex(int hashCode){
        return hashCode % hashList.length;
    }

    public Node searchKey(LinkedList<Node> list, String key){
        if(list == null){
            return null;
        }

        for (Node n : list){
            if(n.key.equals(key)){
                return n;
            }
        }

        return null;
    }

    void put(String key, String value){
        int hashCode = getHashCode(key);
        int idx = convertToIndex(hashCode);
        LinkedList<Node> list = hashList[idx];

        if(list == null){
            list = new LinkedList<Node>();
            hashList[idx] = list;
        }

        Node node = searchKey(list , key);
        if(node == null){
            list.addLast(new Node(key, value));
        }else{
            node.setValue(value);
        }
    }

    String get(String key){
        int hashCode = getHashCode(key);
        int idx = convertToIndex(hashCode);
        LinkedList<Node> list = hashList[idx];
        Node n = searchKey(list, key);
        return n == null ? "Not found" : n.getValue();

    }

    public static void main(String[] args) {
        HashTable table = new HashTable(2);
        table.put("betterfly", "chung jae");
        table.put("dfasfsf", "zzzz");
        table.put("aaaasdf", "gasdf");

        System.out.println(table.get("betterfly"));
    }
}
