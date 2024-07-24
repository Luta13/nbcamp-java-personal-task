package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();

            if (num1 <= 0 || num2 <= 0) {
                System.out.println("입력하신 두 수중 양의 정수가 아닌 수가 있습니다. 다시 입력해주세요.");
            } else
                break;
        }
        while(true) {
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char operator = sc.next().charAt(0);
            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    break;

                default:
                    System.out.println("잘못된 기호를 입력하셨습니다. 다시 입력해주세요.");

            }
        }


    }
}
