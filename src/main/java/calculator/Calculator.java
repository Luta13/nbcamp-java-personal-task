package calculator;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Calculator {
    private ArrayList<Long> resultList = new ArrayList<Long>();
    long result = 0;

    void setResultList(ArrayList<Long> resultList)
    {
        this.resultList = resultList;
    }
    ArrayList<Long> getResultList()
    {
        return resultList;
    }
    void removeFirst()
    {
        if(resultList.isEmpty()) {
            System.out.println("조회된 데이터가 없습니다.");
            return;
        }

        this.resultList.remove(0);
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

