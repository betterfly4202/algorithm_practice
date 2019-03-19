package com.algorithm.hackerrank;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.03.18
 */
public class ClimbingTheLeaderboardTest {
    private List<Integer> playerScoreList;
    private List<Integer> aliceScoreList;
    private ClimbingTheLeaderboard board= new ClimbingTheLeaderboard();

    @Before
    public void setUp(){
        // 플레이어들 스코어 리스트
        String[] playerScores = "100 20 80 160 80 140 60 40 90".split(" ");
        playerScoreList = new ArrayList<>();
        for(int i=0; i < playerScores.length; i++){
            int tempScores = Integer.parseInt(playerScores[i]);
            if (!playerScoreList.contains(tempScores)){
                playerScoreList.add(tempScores);
            }
        }

        // 엘리스 스코어 리스트
        String[] aliceScores = "80 70 20 160".split(" ");
        aliceScoreList = new ArrayList<>();
        for(int i=0; i < aliceScores.length; i++){
            int tempScores = Integer.parseInt(aliceScores[i]);
            if (!aliceScoreList.contains(tempScores)){
                aliceScoreList.add(tempScores);
            }
        }
    }

    @Test
    public void 랜덤_숫자(){
        Random r = new Random();

        for (int i=0; i<100; i++){
            int makeScore = r.nextInt(200)+1;
            assertTrue(makeScore > 0);
            assertTrue(makeScore < 201);
        }
    }

    @Test
    public void 플레이어_스코어_내림차순() {
        ClimbingTheLeaderboard.Descending descending = board.new Descending();
        Collections.sort(playerScoreList, descending);

        for (int s : playerScoreList){
            System.out.print(s+ " ");
        }
    }

    @Test
    public void 엘리스_스코어_오름차순(){
        ClimbingTheLeaderboard.Ascending ascending = board.new Ascending();
        Collections.sort(aliceScoreList, ascending);

        for (int s : aliceScoreList){
            System.out.print(s+ " ");
        }
    }

    // compare : (x < y) ? -1 : ((x == y) ? 0 : 1);
    // player : 150 140 100 90 80 60 40 20
    // alice : 20 70 80 160
    @Test
    public void 순위_비교(){
        ClimbingTheLeaderboard.Ascending ascending = board.new Ascending();
        Collections.sort(aliceScoreList, ascending);
        ClimbingTheLeaderboard.Descending descending = board.new Descending();
        Collections.sort(playerScoreList, descending);

        int [] rank = new int[aliceScoreList.size()];

        for(int i=0; i<aliceScoreList.size(); i++){
            for(int k=0; k<playerScoreList.size(); k++){
                int compareValue = aliceScoreList.get(i).compareTo(playerScoreList.get(k));

                rank[i] = compareValue == -1 ? k : k+1;

                if(compareValue == 0 || compareValue == 1){
                    break;
                }
            }
        }

        for (int aa : rank){
            System.out.println(aa);
        }
    }
}