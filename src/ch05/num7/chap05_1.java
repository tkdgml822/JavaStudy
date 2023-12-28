package ch05.num7;

public class chap05_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.println(i + "x" + j + "=" + i * j);
                }
            }
        }
    }
}
