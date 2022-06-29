package turnOnOff;

public class Refrigerator implements RemoteControl {
    boolean on;
    public void turnOn() {
        on = true;
        System.out.println("냉장고를 켰습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("냉장고를 껐습니다.");
    }
}
