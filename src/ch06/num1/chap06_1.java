package ch06.num1;

public class chap06_1 {
    public static void main(String[] args) {
        operations(10, 5);
    }

    public static void operations(int n1, int n2) {
        System.out.println("더하기:" + (n1 + n2));
        System.out.println("빼기:" + (n1 - n2));
        System.out.println("곱하기:" + (n1 * n2));
        System.out.println("나누기:" + (n1 / n2) + "\n" + "나머지:" + (n1 % n2));
    }
}
