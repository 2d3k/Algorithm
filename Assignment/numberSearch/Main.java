public class Main {
    public static void main(String[] args) {
        System.out.print(numberSearch("Hello6 9World 2,"));
    }
    public static int numberSearch(String str) {
        if (str.length() == 0) return 0;

        String digit = "0123456789";
        double sum = 0;
        String pure_str = "";

        for(int i = 0; i < str.length(); i++) {
            if (digit.indexOf(str.charAt(i)) != -1) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
            else if (str.charAt(i) != ' ') {
                pure_str = pure_str + str.charAt(i);
            }
        }
        double result = sum / pure_str.length();
        return (int) Math.round((result * 10) /10);
    }
}
