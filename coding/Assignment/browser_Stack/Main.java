/*
문제: 브라우저 앞으로 가기와 뒤로 가기 만들기

조건
새 페이지에 접속: prev에 원래 / next 비움
뒤로가기: 원래 페이지를 next / prev 스택의 top으로 이동 -> prev값을 pop
앞으로 가기: 원래 페이지 prev / next 스택의 top로 이동 -> next값을 pop
뒤로가기 앞으로 가기 불가: push 안 함
첫글자에 알파벳 대문자가 아니면 false 리턴

주의사항
1. 뒤로가기 : -1, 앞으로가기 : +1
2. 다음 방문할 페이지는 현재와 다름
3. 새로운 페이지 접속은 대문자로 표기
 */

package com.codestates.coplit;
import java.util.*;

public class Solution {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        /*
        인자 1: actions
        String 타입을 요소로 갖는 브라우저에서 행동한 순서를 차례대로 나열한 배열
        인자 2: start
        String 타입의 시작 페이지를 나타내는 현재 접속해 있는 대문자 알파벳
         */

        //현재 페이지에 행동 순서 배열 추가
        //stack은 후입선출(가장 마지막에 들어온 게 가장 먼저 나옴)
        current.add(start);

        for (int i = 0; i < actions.length; i++) {
            //뒤로가기
            if (actions[i].equals("-1") && !prevStack.empty()) {
                //prev페이지 마지막 값 가져오고 지우기
                String prevPage = prevStack.pop();
                //next페이지에 원래 페이지 가져오고 지우기
                nextStack.push(current.pop());
                //현재페이지에 prev값 넣기
                current.push(prevPage);
            }
            else if (actions[i].equals("1") && !nextStack.empty()) {
                //next페이지에 마지막 값 가져오고 지우기
                String nextPage = nextStack.pop();
                //prev페이지에 원래페이지 넣고 지우기
                prevStack.push(current.pop());
                //현재페이지에 next값 넣기
                current.push(nextPage);
            }
            //조건 4번
            else if (actions[i].equals("-1") || actions[i].equals("1")) {
            }
            else {
                //prev에 원래 페이지 넣고 지우기
                prevStack.push(current.pop());
                //현재 페이지에 값 넣기
                current.push(actions[i]);
                //다음 페이지 비우기
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }
}