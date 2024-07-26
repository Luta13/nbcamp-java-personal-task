package calculator;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Calculator {




    double result = 0;
    public ArrayList<Double> resultList;

    public void setResultList(ArrayList<Double> resultList)
    {
        this.resultList = resultList;
    }
    public ArrayList<Double> getResultList()
    {
        return resultList;
    }
    void removeResult()
    {
        resultEmpty();
        resultList.remove(0);
        System.out.println("삭제가 완료되었습니다.");
    }
    void resultEmpty()
    {
        if(resultList.isEmpty())
        {
            System.out.println("조회된 데이터가 없습니다.");
            return;
        }
    }
    void inquiryResults()
    {
        resultEmpty();
        for(Double d : resultList)
        {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    public void validate(int a, int b, String operator)
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
        }
    }
    public void saveResult(double result)
    {
        resultList.add(result);
    }
    public double calculate(int a, int b, String operator)
    {
        return 0;
    }
    public double calculate(int radius)
    {
        return 0;
    }








}


