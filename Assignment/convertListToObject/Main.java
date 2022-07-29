package com.codestates.coplit;
import java.util.*;

public class Solution {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap <String, String> result = new HashMap <>();
        if (arr.length == 0) return result;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i].length != 0) {
                if (!result.containsKey(arr[i][0])){
                    result.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return result;
    }
}