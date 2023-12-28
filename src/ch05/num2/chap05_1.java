package ch05.num2;

public class chap05_1 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        if (num1 > num2) {
            big = num1;
        }
        else {
            big = num2;
        }
        System.out.println("큰 수 : " + big);

        if (num1 > num2) {
            diff = num1 - num2;
        }
        else {
            diff = num2 - num1;
        }

        System.out.println("절 대 값: " + diff);
    }
}