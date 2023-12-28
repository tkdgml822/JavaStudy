package ch05.num4;

public class chap05_3 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1000;

        while (num > 0) {
            if ((num % 2 == 0) && (num % 7 == 0)) {
                sum += num;
                System.out.println(num);
            }
            num--;
        }

        System.out.println("합 : " + sum);
    }


}
