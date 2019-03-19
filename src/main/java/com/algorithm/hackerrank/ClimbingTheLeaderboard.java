package com.algorithm.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by betterfly
 * Date : 2019.03.18
 */

/*
    https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem#!

    Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking. The game uses Dense Ranking, so its leaderboard works like this:

    The player with the highest score is ranked number  on the leaderboard.
    Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
    For example, the four players on the leaderboard have high scores of , , , and . Those players will have ranks , , , and , respectively. If Alice's scores are ,  and , her rankings after each game are ,  and .

    Function Description

    Complete the climbingLeaderboard function in the editor below. It should return an integer array where each element represents Alice's rank after the  game.

    climbingLeaderboard has the following parameter(s):

    scores: an array of integers that represent leaderboard scores
    alice: an array of integers that represent Alice's scores
    Input Format

    The first line contains an integer , the number of players on the leaderboard.
    The next line contains  space-separated integers , the leaderboard scores in decreasing order.
    The next line contains an integer, , denoting the number games Alice plays.
    The last line contains  space-separated integers , the game scores.

    Constraints

     for
     for
    The existing leaderboard, , is in descending order.
    Alice's scores, , are in ascending order.
    Subtask

    For  of the maximum score:

    Output Format

    Print  integers. The  integer should indicate Alice's rank after playing the  game.

    Sample Result
    7
    100 100 50 40 40 20 10
    4
    5 25 50 120
 */
public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException{
        List<Integer> playerScoreList = new ArrayList<>();
        List<Integer> aliceScoreList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] scores = br.readLine().split(" ");

        for(int i=0; i < scores.length; i++){
            int tempScores = Integer.parseInt(scores[i]);
            if(!playerScoreList.contains(tempScores)){
                playerScoreList.add(tempScores);
            }
        }

        String [] aliceScores = br.readLine().split(" ");

        for(int i=0; i < aliceScores.length; i++){
            int tempScores = Integer.parseInt(aliceScores[i]);
            if(!aliceScoreList.contains(tempScores)){
                aliceScoreList.add(tempScores);
            }
        }

        for (int s : playerScoreList){
            System.out.print("   playerList : "+s);
        }

        System.out.println();

        for (int s : aliceScoreList){
            System.out.print("   aliceList : "+s);
        }

    }

    public class Descending implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }

    public class Ascending implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
}