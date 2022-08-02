package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean ABCheck(String str) {
        //예외는 false 반환
        if (str.length() == 0) return false;

        str = str.toLowerCase();

        for (int i = 4; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' && str.charAt(i-4) == 'b') || (str.charAt(i) == 'b'&& str.charAt(i-4) == 'a')) return true;
        }
        return false;
    }
}