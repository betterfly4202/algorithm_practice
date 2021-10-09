package com.algorithm.yanolja;

import java.util.HashMap;
import java.util.Map;

public class ga {
    /*
        S : 가위
        R : 바위
        P : 보
     */
    private enum GestureBox{
        R("바위", "P") {
            @Override
            public int result(String gesture) {
                if (gesture.equals("S")){
                    return 2;
                }else if (gesture.equals("R")){
                    return 1;
                }

                return 0;
            }
        },
        S("가위", "R"){
            @Override
            public int result(String gesture) {
                if (gesture.equals("P")){
                    return 2;
                }else if (gesture.equals("S")){
                    return 1;
                }

                return 0;
            }
        },
        P("보", "S"){
            @Override
            public int result(String gesture) {
                if (gesture.equals("R")){
                    return 2;
                }else if (gesture.equals("P")){
                    return 1;
                }

                return 0;
            }
        };

        public String gesture;
        public String winGesture;
        GestureBox(String gesture, String winGesture) {
            this.gesture =  gesture;
            this.winGesture = winGesture;
        }

        public abstract int result(String gesture);
    }

    public int solution(String g){
        Map<String, Integer> gestureMap = new HashMap<>();
        
        int result = 0;
        for (String gesture: g.split("")) {
            if (!gestureMap.containsKey(gesture)) {
                gestureMap.put(gesture, 1);
            }else{
                gestureMap.put(gesture, gestureMap.get(gesture) + 1);
            }
        }

        return getBestGestureScore(gestureMap);
    }

    private int getBestGestureScore(Map<String, Integer> map){
        int max = 0;
        String choice = "";

        for (String key : map.keySet()) {
            String winGesture = GestureBox.valueOf(key).winGesture;
            int sum = 0;
            for (Map.Entry<String, Integer> gesture: map.entrySet()) {
                sum += GestureBox.valueOf(winGesture).result(gesture.getKey()) * gesture.getValue();
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
