package Dice; // Random Class
import java.util.Random;

public class Dice {
    Random ran = new Random();
    private int value;

    public Dice() {
        value = 0;
    }

    public int roll() {
        // Math.random 으로도 뽑을 수 있다.
        // value = (int)(Math.random()*6)+1;
        value = ran.nextInt(6)+1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int rollcount = 0;

        while (true) {
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1 나온 수 : " + dice1.getValue() + ", 주사위2 나온 수 : " + dice2.getValue());
            rollcount++;
            if (dice1.getValue() + dice2.getValue() == 2) {
                break;
            }
            System.out.println("같은 수가 나오는데 걸린 횟수 : " + rollcount);
        }
    }
}