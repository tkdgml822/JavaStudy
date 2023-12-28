package ch05.num6;

public class chap05_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (true) {
            if (num % 2 != 0) {
                sum += num;
            }

            if (sum > 1000) {
                break;
            }
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
