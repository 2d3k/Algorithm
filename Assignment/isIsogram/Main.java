public class Main {
    public static void main(String[] args) {
        System.out.print(isIsogram("isogram"));
    }
    public static boolean isIsogram(String str) {

        //방법 1
        if (str.length() == 0) return true;

        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase();
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                    return false;
            }
        }
        return true;


        //방법 2
        if (str.length() == 0) return true;

        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
}