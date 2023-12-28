package ch05.num4;

public class chap05_1 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        while (num < 100) {
            sum += num;
            num++;
        }

        System.out.println(sum);
    }
}
