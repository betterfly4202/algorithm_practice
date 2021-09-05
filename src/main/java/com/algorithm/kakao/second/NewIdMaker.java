package com.algorithm.kakao.second;

import java.util.regex.Pattern;

public class NewIdMaker {
    /*
        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
             만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     */
    public String solution(String new_id){
        return removeExceptionCharacter(new_id.toLowerCase());
    }

    public String removeExceptionCharacter(String new_id){
        StringBuilder sb = new StringBuilder();
        /*
            기본 문자 검열 && 연속된 마침표 제거
         */
        for (int i = 0; i < new_id.length(); i++) {
            char verify = new_id.charAt(i);
            if (regex(verify)){
                if(sb.length() > 0 && sb.charAt(sb.length()-1) == '.' && verify == '.'){
                    continue;
                }

                sb.append(verify);
            }
        }

        /*
            처음이나 끝에 위치할때 제거함
         */
        if(sb.length() > 0){
            if(sb.charAt(0) == '.'){
                sb.deleteCharAt(0);
            }

            if(sb.length() > 0){
                sb = removeFirstAndLastPoint(sb);
            }
        }else{
            sb.append("a");
        }

        if (sb.length() > 15){
            sb = removeFirstAndLastPoint(sb.delete(15, sb.length()));
        }

        if(sb.length() < 3){
            if(sb.length() < 1){
                sb.append("a");
            }
            for (int i = sb.length(); i < 3; i++) {
                sb.append(sb.charAt(sb.length()-1));
            }
        }

        return sb.toString();
    }

    private boolean regex(char id){
        String pattern = "^[a-z0-9-_.]*$";
        return Pattern.matches(pattern, String.valueOf(id));
    }

    private StringBuilder removeFirstAndLastPoint(StringBuilder sb){
        if (sb.charAt(sb.length()-1) == '.'){
            sb.deleteCharAt(sb.length()-1);
        }

        return sb;
    }
}
