package ch10.num1;

public class chap10_01 {
    static int total;

    public static void add(int i) {
        total += i;
    }

    public static void showResult() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            chap10_01.add(i);
        }
        chap10_01.showResult();
    }
}
