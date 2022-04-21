package turnOnOff;

public class RemoteControlTest {
    public static void main(String[] args) {
        Television t = new Television();
        t.turnOn();
        t.turnOff();

        Refrigerator r = new Refrigerator();
        r.turnOn();
        r.turnOff();
    }
}
