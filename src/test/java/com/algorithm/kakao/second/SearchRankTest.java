package com.algorithm.kakao.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRankTest {
    SearchRank rank = new SearchRank();
    SearchRankAnswer answer = new SearchRankAnswer();
    String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
    String [] query = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};

    @Test
    public void rank(){
        System.out.println(rank.solution(info, query));;
    }

    @Test
    public void answer(){
        System.out.println(answer.solution(info, query));
    }
}