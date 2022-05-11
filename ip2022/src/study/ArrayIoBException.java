package study;

public class ArrayIoBException {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0] : " + data1);
            System.out.println("args[1] : " + data2);
        } catch (Exception e) {
            System.out.println("배열의 인덱스 값이 존재하지않습니다.");
        } finally {
            System.out.println("소스코드를 다시 한번 확인해주세요.");
        }
    }
}
