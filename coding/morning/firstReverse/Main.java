//문제: 문자열을 입력받아 순서가 뒤집힌 문자열을 리턴

public class Main {
    public static void main(String[] args) {
        //배열 arr 만들기
        char[] arr =  str.toCharArray();

        //뒤집힌 걸 받을 배열 만들기
        char[] rv_arr = new char[arr.length];

        //for문을 사용해서 rv_arr에 arr의 문자열을 역순으로 받음
        for (int i = 0; i < arr.length; i++) {
            rv_arr[arr.length - 1 - i] = arr[i];
        }
        String rv_Str = new String(rv_arr);
        return rv_Str;
    }
}
 /*
StringBuilder을 이용한 방법
StringBuilder sb = new StringBuilder (str);
return sb.reverse().toString();
*/
//toCharArray(): 배열을 char형으로 바꿔줌

