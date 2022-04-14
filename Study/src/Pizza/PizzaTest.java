package Pizza;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("A");
        Pizza p2 = new Pizza("B");
        Pizza p3 = new Pizza("C");

        int cnt = Pizza.count;
        System.out.println("오늘 팔린 피자 갯수 : " + cnt);
    }
}
