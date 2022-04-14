package Pizza;

public class Pizza {
     private String toping;
     // private int radius;
     // static final double pie = 3.14;

    static int count = 0;

    public Pizza(String toping) {
        this.toping = toping;
        count++;
    }
}
