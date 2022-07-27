package com.codestates.coplit;
import java.util.;

public class Main {
    public int computeWhenDouble(double interestRate) {
        // TODO:
        double rate = 1 + interestRate / 100; //연이율
        double principal = 1; 			//원금
        int year = 0; 				//기간

        while (principal < 2){
            principal = principal * rate;
            year++;
        }
        return year;
    }
}


//연이율이 원금 2배되는 기간 반환(int타입)
/*
해결 과정
1. 기간이 되는 것 선언
    -> 빠진 것: 연이율, 원금
2. if문 사용해서 2배가 되는 조건 걺
    -> if문이 아니라 while을 사용해서 조건이 만족되면 year을 올려야 됨
*/
