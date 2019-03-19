package com.algorithm.hackerrank;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Stream.of;
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

    @Test
    public void stream_test(){
        Integer [] scores = new Integer []{130, 50 , 90, 10, 70, 60 ,70};
        Integer [] alice = new Integer []{80, 140 , 80, 10, 50};

        // 130, 90, 70, 60, 50 , 10
        // 10, 50 , 80, 140
        // 6, 5, 3, 1

        int [] rank = new int[alice.length];

        AtomicInteger order = new AtomicInteger(0);
        AtomicInteger count = new AtomicInteger(0);
        Arrays.stream(alice).distinct().sorted().forEach(e ->{
            Arrays.stream(scores).distinct().sorted(
                    new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o2.compareTo(o1);
                        }
                    }).forEach(k ->{
                int compareValue = e.compareTo(k);
                // e > k = 1,  e==k = 0, e<k = -1
                switch (compareValue){
                    case 1 : rank[order.get()] = count.get();
                        return;
                    case 0 : rank[order.get()] = count.get()+1;
                        return;
                    case -1 : rank[order.get()] = count.get()+2;
                        break;
                }

                count.getAndIncrement();
//                if(compareValue == 1 || compareValue ==0){
//                    return;
//                }
            });
            count.set(0);
            order.getAndIncrement();
        });


        for (int dd : rank){
            System.out.println("zz : " + dd);
        }
    }

    @Test
    public void arrayTest(){
        Integer [] scores = new Integer []{100,90,90,80,75,60};
        Integer [] alice = new Integer []{50,65,77,90,102};

        // 100, 90, 80, 75, 60
        // 50, 65, 77 90, 102
        // 6, 5 , 4, 2, 1

        List<Integer> scoreList = new ArrayList<>();
        List<Integer> aliceList = new ArrayList<>();
        for(int t : scores){
            if(!scoreList.contains(t)){
                scoreList.add(t);
            }
        }

        for(int t : alice){
            if(!aliceList.contains(t)){
                aliceList.add(t);
            }
        }

        Collections.sort(scoreList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        Collections.sort(aliceList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


        int [] rank = new int[aliceList.size()];

        for(int i=0; i<aliceList.size(); i++){
            for(int k=0; k<scoreList.size(); k++) {

            }
        }

    }
}