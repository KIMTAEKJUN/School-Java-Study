package calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        Calc calc = new CompleteCalc();

        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.time(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
    }
}
