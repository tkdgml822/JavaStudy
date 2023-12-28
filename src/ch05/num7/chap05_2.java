package ch05.num7;

public class chap05_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (((i * 10 + j) + (j * 10 + i) == 99)) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
