package study;

public class Min {
    public static double minArray(double[] list) {
        double Min = list[0];
        for (double min : list) {
            if (Min > min) {
                Min = min;
            }
        }
        return Min;
    }

    public static void main(String[] args) {
        double Min;

        double[] a = {0.3, 0.7, 0.5, 0.9, 1.5};
        double[] b = {2.1, 3.6, 1.1, 4.7, 5.9};

        Min = minArray(a);
        System.out.println("최소값 : " + Min);

        Min = minArray(b);
        System.out.println("최소값 : " + Min);
    }
}
