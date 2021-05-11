package multiplication;

public class MultNum {

    public static int longNum(int firstNumber, int secondNumber) {
        int longerNumber;
        if (String.valueOf(firstNumber).length() < String.valueOf(secondNumber).length()) {
            longerNumber = secondNumber;
        } else {
            longerNumber = firstNumber;
        }
        return longerNumber;
    }

    public static int shortNum(int firstNumber, int secondNumber) {
        int shorterNumber;
        if (String.valueOf(firstNumber).length() > String.valueOf(secondNumber).length()) {
            shorterNumber = secondNumber;
        } else {
            shorterNumber = firstNumber;
        }
        return shorterNumber;
    }


    public static void repeatNumbers(int n, String symbol) {
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.valueOf(symbol).repeat(Math.max(0, n)));
        System.out.print(resultString);
    }


    public static void repeatLine(int n, String symbol) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultString.append(symbol);

        }
        System.out.print(resultString);
        System.out.println();
    }


    public static void interMult(int firstNumber, int secondNumber) {

        int rightShift = 0;
        while (secondNumber > 0) {
            int number = firstNumber * (secondNumber % 10);
            secondNumber /= 10;
            repeatNumbers(width - rightShift - String.valueOf(number).length(), " ");
            System.out.println(number);
            rightShift ++;
        }
        repeatNumbers(1, " ");
    }

    static int width = 0;


    public static void printMult(int firstNumber, int secondNumber) {
        width = 0;
        int shiftNumber = 10;
        repeatNumbers(shiftNumber, " ");
        System.out.println(longNum(firstNumber, secondNumber));
        width = shiftNumber + String.valueOf(longNum(firstNumber, secondNumber)).length();
        repeatNumbers(shiftNumber - 2, "");
        repeatNumbers(shiftNumber, " ");
        repeatNumbers(String.valueOf(longNum(firstNumber, secondNumber)).length() - String.valueOf(shortNum(firstNumber, secondNumber)).length(), " ");
        System.out.println(shortNum(firstNumber, secondNumber));
        repeatNumbers(shiftNumber, " ");
        repeatLine(String.valueOf(longNum(firstNumber, secondNumber)).length(), "-");
        interMult(longNum(firstNumber, secondNumber), shortNum(firstNumber, secondNumber));
        repeatNumbers(width - (String.valueOf(firstNumber * secondNumber)).length() - 1, " ");
        repeatLine(String.valueOf(firstNumber * secondNumber).length(), "-");
        repeatNumbers(width - String.valueOf(firstNumber * secondNumber).length(), " ");
        System.out.println(firstNumber * secondNumber);
    }
}