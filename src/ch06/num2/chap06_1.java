package ch06.num2;

public class chap06_1 {
    public static void main(String[] args) {
        System.out.println("원의 넓이 :" + area(2.4));
        System.out.println("원의 둘레 :" + cir(2.4));
    }

    public static double area(double r) {
        return 3.1415926535 * (r * r);
    }

    public static double cir(double r) {
        return 3.1415926535 * 2 * r;
    }
}
