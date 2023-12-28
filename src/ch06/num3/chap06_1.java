package ch06.num3;

public class chap06_1 {
    public static void main(String[] args) {
        System.out.println("3의 제곱: " + square(3));
    }

    public static int square(int n) {
        if (n == 1) {
            return 2;
        }
        else {
            return square(n - 1) * 2;
        }
    }
}
