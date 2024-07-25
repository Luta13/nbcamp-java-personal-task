package calculator;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = 0, num2 = 0;
        ArrayList<Long> resultList = new ArrayList<Long>();
        int resultIndex = 0;
        long tempResult = 0;
        int count = 0;
        String operator = "";
        String input = "";
        Calculator calculator = new Calculator();


 program:   while (true) {
            System.out.println("반복문을 진행하려면 1, 원의 너비 연산을 진행하려면 2를 입력");
            input = sc.next();
            if(input.equals("1")) {
                while (true) {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextLong();

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextLong();


                    if (num1 < 0 || num2 < 0) {
                        System.out.println("입력하신 두 수중 양의 정수가 아닌 수가 있습니다. 다시 입력해주세요.");
                    } else
                        break;
                }
                System.out.print("사칙연산 기호를 입력하세요: ");
//            do {
//                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
//                operator = sc.next();
//                switch (operator) {
//                    case "+":
//                        tempResult = num1 + num2;
//                        resultList.add(tempResult);
//                        System.out.println("결과: " + NumberFormat.getInstance().format(tempResult));
//
//                        break;
//
//                    case "-":
//                        tempResult = num1 - num2;
//                        resultList.add(tempResult);
//                        System.out.println("결과: " + NumberFormat.getInstance().format(tempResult));
//
//                        break;
//
//                    case "*":
//                        tempResult = num1 * num2;
//                        resultList.add(tempResult);
//                        System.out.println("결과: " + NumberFormat.getInstance().format(tempResult));
//
//                        break;
//
//                    case "/":
//                        tempResult = num1 / num2;
//                        resultList.add(tempResult);
//                        System.out.println("결과: " + NumberFormat.getInstance().format(tempResult));
//
//                        break;
//
//
//                    default:
//                        System.out.println("잘못된 기호를 입력하셨습니다. 다시 입력해주세요.");
//                        break;
//
//                }
//            }
//            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));
                operator = sc.next();
                calculator.calculate(num1, num2, operator);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                input = sc.next();
                if (input.equals("remove")) {
                    calculator.removeResult();
                } else System.out.println("삭제하지 않습니다.");


                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회");
                input = sc.next();
                if (input.equals("inquiry")) {
                    calculator.inquiryResults();
                } else System.out.println("조회하지 않습니다.");
            }
            else if(input.equals("2"))
            {
                while(true) {
                    System.out.println("원의 반지름을 입력해주세요.(양의 정수만 입력 가능)");
                    int radius = sc.nextInt();
                    if (radius < 0) {
                        System.out.println("양의 정수만 입력 가능합니다.");
                        continue;
                    }
                    else
                    {
                        double circleResult = calculator.calculateCircleArea(radius);
                        System.out.println("원의 넓이 : " + circleResult);
                        calculator.saveCircleAreaList(circleResult);
                        System.out.println("현재 저장된 원의 너비 연산 결과 ");
                        calculator.inquiryCircleAreaList();
                        break;
                    }

                }
            }
            else {
                System.out.println("올바른 수를 입력해 주세요.");
                continue;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료), 1 입력시 재시작");
            while (true) {
                input = sc.next();
                if (input.equals("exit")) break program;
                else if (input.equals("1")) break;
                else System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }

        }
    }
}
