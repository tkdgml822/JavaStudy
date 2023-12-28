package ch05.num5;

public class chap05_1 {
    public static void main(String[] args) {
        int sum = 1;

        for (int num = 1; num < 11; num++) {
            sum *= num;
        }

        System.out.println(sum);
    }
}
