package digits;
import java.util.logging.Logger;

public class Palindrome {
    private static Logger logger = Logger.getLogger(Palindrome.class.getName());

    public static void main(String[] args) {
        int result = getMaxPalindrome();

        logger.info("Max palindrome is " + result);
    }

    private static int getMaxPalindrome() {
        for (int a = 7777; a > 777; a--) {
            for (int b = 8888; b > 888; b--) {
                int result = a * b;
                if (isPalindrome(result)) return result;
            }
        }
        return -1;
    }

    private static boolean isPalindrome(int result) {
        final String str = String.valueOf(result);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) return false;
        }
        return true;
    }
}