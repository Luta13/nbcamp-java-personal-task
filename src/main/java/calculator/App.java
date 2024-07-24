package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int[] result = new int[10];
        int resultIndex = 0;
        int tempResult = 0;
        int count = 0;
        String operator = "";
        String input = "";
        while (true) {
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();

                if (num1 <= 0 || num2 <= 0) {
                    System.out.println("입력하신 두 수중 양의 정수가 아닌 수가 있습니다. 다시 입력해주세요.");
                } else
                    break;
            }
            result[9] = tempResult;
            do {
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                operator = sc.next();
                switch (operator) {
                    case "+":
                        tempResult = num1 + num2;
                        result[resultIndex] = tempResult;
                        System.out.println("결과: " + tempResult);
                        break;

                    case "-":
                        tempResult = num1 - num2;
                        result[resultIndex] = tempResult;
                        System.out.println("결과: " + tempResult);
                        break;

                    case "*":
                        tempResult = num1 * num2;
                        result[resultIndex] = tempResult;
                        System.out.println("결과: " + tempResult);
                        break;

                    case "/":
                        tempResult = num1 / num2;
                        result[resultIndex] = tempResult;
                        System.out.println("결과: " + tempResult);
                        break;


                    default:
                        System.out.println("잘못된 기호를 입력하셨습니다. 다시 입력해주세요.");
                        break;

                }
            }
            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));
            resultIndex++;
            count++;
            if (count >= 10) {
                resultIndex = 9;
                for (int i = 0; i < 9; i++) {
                    result[i] = result[i + 1];
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료), 1 입력시 재시작");
            while (true) {
                input = sc.next();
                if (input.equals("exit")) break;
                else if (input.equals("1")) break;
                else System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }


        }
    }
}
