package com.codestates.coplit;
import java.util.*;

public class Solution {
    public String firstCharacter(String str) {
        // 빈 문자열은 빈 문자열 리턴
        if (str.length() == 0) return "";

        //split(): 구분자를 기준으로 배열형식의 문자열을 잘라줌
        //words 배열을 " "를 기준으로 자름
        String[] words = str.split(" ");
        String result = "";

        //charAt(): 문자열 중 한글자만 선택해 char 타입으로 변환
        //for문을 사용해 result에 words의 단어 중 첫 글자만 가져옴
        for (int i = 0; i < words.length; i++) {
            result = result + words[i].charAt(0);
        }

        return result;
    }
}