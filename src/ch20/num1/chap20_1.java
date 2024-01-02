package ch20.num1;

import java.util.Random;
import java.util.Scanner;

public class chap20_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 두개 입력 :");
        int A = sc.nextInt();
        int Z = sc.nextInt();
        int min = 0;
        int max = 0;

        if (A > Z) {
            max = A;
            min = Z;
        }
        else {
            max = Z;
            min = A;
        }

        Random rand = new Random();

        System.out.println(rand.nextInt(10));
        int count = 0;
        int rn = 0;
        // 10번 난수 생성
        for (int i = 0; i < 10; i++) {
            rn = min; // 작은 값 rn에 대입
            rn += rand.nextInt(max - min + 1); // min 이상 값이 나와야 되기 때문에 더 해준다.
            System.out.println(rn);
        }

    }
}
