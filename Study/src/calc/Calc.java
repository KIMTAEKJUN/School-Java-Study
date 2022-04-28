package calc;

public interface Calc {
    int ERROR = -999999999;

    // 덧셈
    int add(int num1, int num2);

    // 뺄셈
    int substract(int num1, int num2);

    // 곱하기
    int time(int num1, int num2);

    // 나누기
    int divide(int num1, int num2);
}
