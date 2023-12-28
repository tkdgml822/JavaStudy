package ch06.num3;

public class chap06_2 {
    public static void main(String[] args) {
        toBinary(10);
    }

    public static int toBinary(int n) {
        if (n > 0) {
            int bin = n % 2;
            n /= 2;

            toBinary(n);
            System.out.print(bin);
        }
        return 0;
    }

}
