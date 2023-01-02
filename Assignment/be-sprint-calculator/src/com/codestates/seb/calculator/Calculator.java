package com.codestates.seb.calculator;
        import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");

    Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO..
    double sum = 0; //계산결과
    double num1 = 0; //첫 번째 숫자
    double num2 = 0; //두 번째 숫자

    String oop; // 연산자

    //계산 반복문
    while (true) {
      System.out.print("첫 번째 숫자 : "); //첫 번째 숫자 입력
      num1 = input.nextFloat();
      while (true) { //연산자 오입력시 메세지 및 재입력
          System.out.print("+, -,, / : "); //연산자 입력
          oop = input.next();
            if (oop.equals("+") || oop.equals("-") || oop.equals("/")||oop.equals("")) {
              break;
            }
          System.out.println("다시 입력해주세요.");
      }
      //나누기일 경우 두 번째 숫자에 0이 올경우 오입력 메세지 및 재입력
      while (true) {
        System.out.print("두 번째 숫자 : ");//두 번째 숫자 입력
        num2 = input.nextFloat();
          if (num2 == 0 && oop.equals("/")) {
            System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
          }
          else {
            break;
          }
      }
        boolean err = false; // 계산 오류 검출

        //연산자 확인 후 계산
        if (oop.equals("+")) {
          sum = num1 + num2;
        } else if (oop.equals("-")) {
          sum = num1 - num2;
        } else if (oop.equals("")) {
          sum = num1 * num2;
        } else if (oop.equals("/")) {
          sum = num1 / num2;
        }
        //계산 오류 발생시
        else {
          err = true;
        }
        //정상 계산시 결과 출력
        if (err == false) {
          System.out.println("계산결과 : " + sum);
        }
        //오류 발생시 오류메세지 출력
        else {
          System.out.println("오류발생");
        }
      }
    }
}
