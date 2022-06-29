package study;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int number = sc.nextInt();

        System.out.println("이름은 " + name + "이고, 번호는 " + number + "번입니다.");
    }
}
