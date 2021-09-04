package com.algorithm.kakao.second;

import java.util.regex.Pattern;

public class RecommendId {

    public String recommendUserId(String new_id){
        new_id = toLowerCase(new_id);
        new_id = reformId(new_id);
        new_id = defaultId(new_id);
        if (new_id.length() > 15){
            new_id = cuttingLastPoint(new_id);
        }
        new_id = appendLastValue(new_id);
        return new_id;
    }

    public String toLowerCase(String id){
        return id.toLowerCase();
    }

    public boolean regex(String id){
        String pattern = "^[a-z0-9-_.]$";
        return Pattern.matches(pattern, id);
    }

//    public boolean checkSize(String id){
//        return id.length() > 3 && id.length() < 16;
//    }

    public String reformId(String id){
        String result = "";
        for (int i = 0; i < id.length() ; i++) {
            String append = String.valueOf(id.charAt(i));
            if (regex(append)) {
                if(i > 1 && id.charAt(i-1) == '.' && id.charAt(i) == '.'){
                    continue;
                }

                if (i == 0 && id.charAt(i) == '.'){
                    continue;
                }else if(i > 0 && i == id.length()-1 && id.charAt(i) == '.'){
                    continue;
                }

                if (result.length() == 0 && id.charAt(i) == '.'){
                    continue;
                }
                result += append;
            }
        }
        return result;
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
            for (int i = 15; i < id.length(); i++) {
                if (id.charAt(i) != '.'){
                    result = result.substring(0, 14) + id.charAt(i);
                    break;
                }
            }
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
