package digits;

import java.util.Arrays;
import java.util.logging.Logger;


public class Digits {
    private final static Logger logger = Logger.getLogger(Digits.class.getName());
    public static void main(String[] args) {
        int i=12345;
        String s = String.valueOf(i);
        final int[] nums = Arrays.stream(s.split("")).mapToInt(n -> Integer.parseInt(n)).toArray();

        logger.info ("Sum is: " + nums);

    int a = 12345, b = a, c = 0;

        while (b != 0) {
        c += b % 10;
        b /= 10;
    }
        logger.info("Sum of digits in number " + a + " equals " + c);

}

}