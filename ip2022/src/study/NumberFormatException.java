package study;

public class NumberFormatException {
    public static void main(String[] args) throws Exception {
        String data1 = "100";
        String data2 = "a100";

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (Exception e) { // java.lang.study.NumberFormatException
            System.out.println("숫자로 변환할 수 없는 문자열이 존재합니다.");
        } finally {
            System.out.println("소스코드를 다시 한번 확인해주세요.");
        }
    }
}