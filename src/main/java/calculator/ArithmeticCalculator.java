package calculator;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        resultList = new ArrayList<Double>();
    }

    @Override
    public double calculate(int a, int b, String operator) {
        switch (operator) {
            case "+":
                result = a + b;
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "-":
                result = a - b;
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "*":
                result = a * b;
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "/":
                result = a / b;
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;
        }
        resultList.add(result);
        return result;
    }
}
