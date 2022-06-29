package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        System.out.println("=======================");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 모든 책 출력");
        System.out.println("4. 종료");
        System.out.println("=======================");
        System.out.print("메뉴를 선택하시오 : ");

        int menu = scan.nextInt();

        scan.nextLine();

        switch (menu) {
            case 1:
                String title = scan.nextLine();
                int star = scan.nextInt();
                bookList.add(new Book(title, star));
            case 2:
                String title1 = scan.nextLine();
                for (Book e : bookList) {
                    if (e.getTitle().equals(title1)) {
                        System.out.println(e);
                    }
                    break;
                }
            case 3:
                for (Book e : bookList) {
                        System.out.println(e);
                }
            case 4:
                break;
        }
    }
}
