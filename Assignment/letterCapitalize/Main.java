/*
문제: 문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴
 */

package com.codestates.coplit;
import java.util.*;

public class Solution {
    public String letterCapitalize(String str) {
        //빈 문자열은 빈 문자열 그대로
        if (str.length() == 0) return str;

        //split()을 사용해서 공백으로 배열 나누기
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            //빈 문자열은 받으면 그대로 i에 그대로 넣음
            if(words[i].isEmpty()) {
                words[i] = words[i];
            }
            else {
                //String.valueOf(words[i].charAt(0)): words배열의 i번째를 String으로 바꾼 뒤char로 변환
                //char로 바꾼 0번쨰 배열을 toUpperCase를 사용해 대문자로 바꿈
                //substring를 통해서 한 단어에서 대문자로 바꾼 첫 글자 외의 글자를 가져옴
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }
        //join()을 사용해 단어 뒤에 띄어쓰기를 붙임
        result = String.join(" ", words);
        return result;
    }
}