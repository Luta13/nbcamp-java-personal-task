package calculator;

import java.text.NumberFormat;
import java.util.ArrayList;

public class CircleCalculator extends Calculator
{


    public CircleCalculator()
    {
        resultList = new ArrayList<Double>();
    }

    @Override
    public double calculate(int radius)
    {
        result = radius * radius * Math.PI;
        return result;
    }
}
