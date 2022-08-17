public class Main {
    public static void main(String[] args) {
        System.out.print(decryptCaesarCipher("khoor", 3));
    }
    public static String decryptCaesarCipher(String str, int secret) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result = result + str.charAt(i);
            }
            else {
                int asis = abc.indexOf(str.charAt(i));
                int tobe = (asis - secret + abc.length()) % abc.length();
                result = result + abc.charAt(tobe);
            }
        }
        return result;
    }
}

