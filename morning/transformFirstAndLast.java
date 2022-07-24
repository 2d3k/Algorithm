//첫 요소와 마지막 요소 HashMap을 리턴

package com.codestates.coplit;
import java.util.*;

public class Main {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if (arr.length == 0){
            return null;
        }
        //빈 배열일 때 null 반환
        HashMap <String, String> result = new HashMap <>();
        //결과를 받을 해쉬맵 생성

        result.put(arr[0], arr[arr.length -1]);
        return result;
    }
}