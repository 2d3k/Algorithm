/* 조건
    들어온 순서대로 선입선출 포장
    동시에 최대 몇 명이 나갈 수 있는지
    맨 앞의 수보다 크면 리턴되지 못하고
    앞의 수보다 작으면 같이 리턴됨
    */

package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int paveBox(Integer[] boxes) {

        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(boxes));
        //asList(): 원본 배열의 주소값 복사, 새로운 원소 추가 삭제 불가 // 자유롭게 추가 제거 하기 위해

        while (arrayList.size() > 0) {
            // 만약 찾았다면, 해당 key를 answer에 넣고, ArrayList에서 그만큼 제외
            for(int i = 0; i < arrayList.size(); i++) {
                //배열 i의 값이 첫번째 보다 크다면
                if(arrayList.get(i) > arrayList.get(0)) {
                    //answer에 i의 값을 추가
                    answer.add(i);
                    //arraylist에 i부터 arraylisy의 마지막까지 잘라줌
                    arrayList = arrayList.subList(i, arrayList.size());
                    break;
                    //subList(): 인덱스를 자르는 용도로 사용
                }
                // 만약 찾지 못했다면 answer에 arrayList 크기를 넣은 후, arrayList 내부의 요소를 전부 삭제
                if(i == arrayList.size() - 1) {
                    //aswer에 arraylisy의 크기를 추가
                    answer.add(arrayList.size());
                    //arraylisy를 비움
                    arrayList.clear();
                }
            }
        }
        return answer.stream().max(Integer::compare).orElse(-1);
    }
}