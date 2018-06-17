package com.algorithm.NHN_Ent.cording_party_2018_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 6. 17.
 * Github : http://github.com/betterfly88
 */

public class Main {
    static LinkedList<Integer> fifo = new LinkedList();
    static ArrayList<Integer> addFifoList = new ArrayList();

    static class Queue {
        /*
         * Description:
         * Time complexity:
         * Space complexity:
         */
        public void enqueue(int v) {
            fifo.add(v);
        }

        /*
         * Description:
         * Time complexity:
         * Space complexity:
         */
        public int dequeue() {
            return fifo.pop();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Queue queue = new Queue();
        String input = scan.nextLine();
        int count = Integer.parseInt(input);

        for (int i = 0; i < count; ++ i) {
            String[] token = scan.nextLine().split(" ");
            if ("ENQUEUE".equals(token[0])) {
                queue.enqueue(Integer.parseInt(token[1]));
            } else if ("DEQUEUE".equals(token[0])) {
                addFifoList.add(queue.dequeue());
            }
        }

        scan.close();

        for(int temp : addFifoList){
            System.out.println(temp);
        }

    }
}
