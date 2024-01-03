package ch20.num2;

import java.util.Arrays;

public class chap20_2_1 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar, (a, b) -> b.age - a.age);

        for (Person a : ar) {
            System.out.println(a);
        }

    }
}