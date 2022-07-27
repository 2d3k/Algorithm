/* 문제:  2의 거듭제곱인지 여부 */

package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean powerOfTwo(long num) {
        //2의 n승이면 true
        if (num == 1) return true;

        //2의 n승이 아니면 false 리턴
        if (num % 2 != 0) return false;

        //2의 n승을 구해주는 powered
        long powered = 2;
        while (powered < num) {
            powered = powered * 2;
        }
        return powered == num;
    }
}
