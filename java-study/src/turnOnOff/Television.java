package turnOnOff;

public class Television implements RemoteControl {
    boolean on;
    public void turnOn() {
        on = true;
        System.out.println("TV를 켰습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV를 껐습니다.");
    }
}
