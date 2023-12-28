package ch05.num6;

public class chap05_1 {
    public static void main(String[] args) {
        int num;
        int count = 0;

        for (num = 1; num < 100; num++) {
            if ((num % 5) != 0 || (num % 7) != 0) {
                continue;
            }
            count++;
            System.out.println(num);
        }

        System.out.println("count: " + count);
    }
}
