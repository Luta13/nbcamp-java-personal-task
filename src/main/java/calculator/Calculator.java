package calculator;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Calculator {
    private ArrayList<Long> resultList;
    long result = 0;
    double circleArea;
    ArrayList<Double> circleAreaList;
    public Calculator()
    {
        resultList = new ArrayList<Long>();
        circleAreaList = new ArrayList<Double>();
    }

    void setResultList(ArrayList<Long> resultList)
    {
        this.resultList = resultList;
    }
    ArrayList<Long> getResultList()
    {
        return resultList;
    }

    void removeResult()
    {
        if(resultList.isEmpty()) {
            System.out.println("조회된 데이터가 없습니다.");
            return;
        }
        resultList.remove(0);
    }
    void inquiryResults()
    {
        if(resultList.isEmpty())
        {
            System.out.println("조회된 데이터가 없습니다.");
            return;
        }

        for(Long l : resultList)
        {
            System.out.print(NumberFormat.getInstance().format(l) + " ");
        }
        System.out.println();
    }
    public double calculateCircleArea(final int radius) {
        //final int radius를 쓴 이유는 radius는 반지름이라 절대 바뀌면 안되는 상수이다.
        circleArea = radius * radius * 3.14f;

        return circleArea;

    }
    public void saveCircleAreaList(double circleArea)
    {
        circleAreaList.add(circleArea);
        return;
    }

    public double getCircleArea() {
        return circleArea;
    }
    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }
    public void inquiryCircleAreaList()
    {
        for(double d : circleAreaList)
        {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public Long calculate(Long a, Long b, String operator)
    {
        try {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("값은 음수일 수 없습니다.");
            } else if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                throw new UnsupportedOperationException("지원하지 않는 연산자입니다.");
            } else if (b == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
            return 0L;
        }
        switch (operator) {
            case "+":
                result = a + b;
                resultList.add(result);
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "-":
                result = a - b;
                resultList.add(result);
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "*":
                result = a * b;
                resultList.add(result);
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;

            case "/":
                result = a / b;
                resultList.add(result);
                System.out.println("결과: " + NumberFormat.getInstance().format(result));
                break;
        }
        return result;
    }




}

