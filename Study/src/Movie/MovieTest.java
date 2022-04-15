package Movie;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

         Movie[] m1 = new Movie[10];

         m1[0] = new Movie("아이언맨", "몰?루");
         m1[1] = new Movie("겨울왕국", "몰?루");

         for (int i=0; i<Movie.cnt; i++) {
             System.out.println("==========================");
             System.out.println("제목 : " + m1[i].title);
             System.out.println("감독 : " + m1[i].director);
             System.out.println("==========================");
             System.out.println();
         }
    }
}
