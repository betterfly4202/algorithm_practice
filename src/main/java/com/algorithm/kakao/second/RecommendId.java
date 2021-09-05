package com.algorithm.kakao.second;

import java.util.regex.Pattern;

/**
 *  https://baek-kim-dev.site/261?url=https://baek-kim-dev.site/261
 */
public class RecommendId {

    /*
    StringBuilder => 멀티스레드 동기화 지원 X, 단일스레드 성능 좋음
    StringBuffer => synchronized 지원 -> 멀티스레드  기화
    String == immutable하기 때문에 하나의 객체 공간, new String하는경우 다른 객체공간을 또 할당받음
     */
    public String recommendUserId(String new_id){
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();
        if(new_id.length() > 2){
            new_id = step1_toLowerCase(new_id);
            new_id = step2_reformId(new_id);
            if (new_id.length() > 15){
                new_id = cuttingLastPoint(new_id);
            }
            new_id = step3_removeFirstAndLastPoint(new_id);
        }
        new_id = defaultId(new_id);
        new_id = appendLastValue(new_id);
        return new_id;
    }

    public String step1_toLowerCase(String id){
        return id.toLowerCase();
    }

    public boolean regex(String id){
        String pattern = "^[a-z0-9-_.]*$";
        return Pattern.matches(pattern, id);
    }

    public String step2_reformId(String id){
        String result = "";
        for (int i = 0; i < id.length() ; i++) {
            String append = String.valueOf(id.charAt(i));
            if (regex(append)) {
                if(i > 1 && id.charAt(i-1) == '.' && id.charAt(i) == '.'){
                    continue;
                }
                result += append;
            }
        }

        return result;
    }

    public String step3_removeFirstAndLastPoint(String id){
        if (id.length() < 1){
            return id;
        }

        if (id.charAt(0) == '.'){
            id = id.substring(1, id.length());
        }

        if (id.charAt(id.length()-1) == '.'){
            id = id.substring(0, id.length()-2);
        }

        return id;
    }

    public String defaultId(String id){
        if (id == null || id == ""){
            return "a";
        }

        return id;
    }

    public String cuttingLastPoint(String id){
        String result = id.substring(0, 15);
        if (result.charAt(result.length()-1) == '.'){
            return id.substring(0, result.length()-1);
        }

        return result;
    }

    public String appendLastValue(String id){
        if(id.length() < 3){
            for (int i = id.length(); i < 3 ; i++) {
                id += id.charAt(id.length()-1);
            }
        }

        return id;
    }
}
