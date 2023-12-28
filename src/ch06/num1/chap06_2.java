package ch06.num1;

public class chap06_2 {
    public static void main(String[] args) {
        absolute(10, 20);
        absolute(-4, 10);
        absolute(1, 5);
    }

    public static void absolute(int n1, int n2) {
        int i = (n1 > n2) ? (n1 - n2) : (n2 - n1);
        System.out.println("절대 차: " + i);
    }
}
