package dividebyzero;

import java.util.logging.Logger;


public class Exceptions {
    private final static Logger logger = Logger.getLogger(Exceptions.class.getName());

    public static void main(String[] args) {

        try {
            int d = 0;
            int a = 10 / d;
        } catch(ArithmeticException e){
                logger.info("delenie na 0");
        }
    }
}