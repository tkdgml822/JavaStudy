package ch06.num2;

public class chap06_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
