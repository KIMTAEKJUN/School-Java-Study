package study;

public class SystemTimeExample {
    public static void main(String[] args) {
        // 시그마공식 - n*(n+1)/2
        // 팩토리얼 - n! = n*(n-1)!
        // 피보나치 - fn = fn-1 + fn-2 / 단, fn=0, fn=1
        long ntime1 = System.nanoTime();
        long mtime1 = System.currentTimeMillis();

        int sum = 0;
        for (int i=1; i<=100000000; i++) {
            sum += i;
        }

        long ntime2 = System.nanoTime();
        long mtime2 = System.currentTimeMillis();

        System.out.println("1~100000000까지의 합 : " + sum);
        System.out.println("계산에 " + (ntime2-ntime1) + " 나노초가 소요되었습니다.");
        System.out.println("계산에 " + (mtime2-mtime1)*0.001 + " 초가 소요되었습니다.");

        System.out.println();

        long ntime10 = System.nanoTime();
        long mtime10 = System.currentTimeMillis();

        long sum0 = 0;
        long i = 100000000;
        sum0 = i*(i+1)/2;

        long ntime20 = System.nanoTime();
        long mtime20 = System.currentTimeMillis();

        System.out.println("1~100000000까지의 합 : " + sum);
        System.out.println("계산에 " + (ntime20-ntime10) + " 나노초가 소요되었습니다.");
        System.out.println("계산에 " + (mtime20-mtime10)*0.001 + " 초가 소요되었습니다.");
    }
}
