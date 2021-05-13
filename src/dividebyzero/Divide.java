package dividebyzero;

import java.util.logging.Logger;


public class Divide {
    private final static Logger logger = Logger.getLogger(Divide.class.getName());

    public static int Divide(int num) throws Exception {
        if (num < 1) throw new Exception("Number is zero");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result /= i;
            return result;
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            int result = Divide(0);
            logger.info(String.valueOf(result));
        }catch (ArithmeticException e){
            logger.info("Норм делишь...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}