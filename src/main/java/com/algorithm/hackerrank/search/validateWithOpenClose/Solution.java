package com.algorithm.hackerrank.search.validateWithOpenClose;

import java.util.stream.Stream;

public class Solution {
    enum OpenClose{
        FIRST("[", "]"),
        SECOND("{", "}"),
        THIRD("(", ")"),
        EMPTY("", "");

        private String open;
        private String close;

        OpenClose(String open, String close) {
            this.open = open;
            this.close = close;
        }

        public String getOpen(){
            return this.open;
        }

        public String getClose(){
            return this.close;
        }

        public static OpenClose findClose(String open){
            return Stream.of(OpenClose.values())
                    .filter(o -> o.getOpen().equals(open))
                    .findFirst()
                    .orElse(EMPTY);
        }
    }

    public static boolean isValid(String brackets) {
        if(brackets.length()%2 != 0){
            return false;
        }

        for (int i = 0; i < brackets.length()/2; i++) {
            String open  = brackets.substring(i, i+1);
            String close = brackets.substring(brackets.length()-1-i, brackets.length()-i);
            if(!OpenClose.findClose(open).getClose().equals(close)){
                return false;
            }

        }
        return true;
    }
}
