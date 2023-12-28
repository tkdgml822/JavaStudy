package ch05.num4;

public class chap05_2 {
    public static void main(String[] args) {
        int num = 1;

        while (num < 101) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        do {
            num--;
            System.out.print(num + " ");
        } while(num > 0);
    }
}
