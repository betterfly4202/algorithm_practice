package com.algorithm.hackerrank.search.gridlandMetro;

import java.util.*;

public class Solution {
    /**
     * @link : https://www.hackerrank.com/challenges/gridland-metro/problem
     * @param n row(행), 세로
     * @param m column(열), 가로
     * @param k
     * @param track 2차원 배열 [start ~ end]
     * @return track이 거치지 않은 공간의 수
     */
    public static int gridlandMetro(int n, int m, int k, int[][] track) {
        List<TreeSet<Track>> list = new ArrayList<>();

        for(int i=0; i<m; i++){
            list.add(new TreeSet<Track>());
        }

        for(int i=0; i<k; i++){
            int j = track[i][0];
            int p = track[i][1];
            int q = track[i][2];
            list.get(j-1).add(new Track(p-1,q));
        }

        int answer = 0;
        for(int i=0; i<n; i++){
            if(list.get(i).size() == 0){
                answer += m;
                continue;
            }
            int thisRowFilledCount = 0;
            Iterator<Track> iter = list.get(i).iterator();
            Track curTrack = iter.next();
            Track nextTrack;
            while(iter.hasNext()){
                nextTrack = iter.next();
                if(curTrack.overlap(nextTrack)){
                    curTrack = Track.merge(curTrack, nextTrack);
                }else{
                    thisRowFilledCount += curTrack.end - curTrack.start;
                    curTrack = nextTrack;
                }
            }
            thisRowFilledCount += curTrack.end - curTrack.start;
            answer += (m - thisRowFilledCount);
        }

        return answer;
    }

    public static class Track implements Comparable<Track>{
        int start;
        int end;

        Track(int i, int j){
            this.start = i;
            this.end = j;
        }

        @Override
        public int compareTo(Track t){
            if(this.start < t.start){
                return -1;
            }else if(this.start > t.start){
                return 1;
            }else{
                if(this.end < t.end){
                    return -1;
                }else{
                    return 1;
                }
            }
        }

        public boolean overlap(Track t){
            if(this.start <= t.start && t.start < this.end){
                return true;
            }
            return false;
        }

        public static Track merge(Track t1, Track t2){
            int end=t1.end > t2.end ? t1.end :t2.end;

            return new Track(t1.start, end);
        }

        public String toString(){
            return "("+start+", "+end+")";
        }
    }
}