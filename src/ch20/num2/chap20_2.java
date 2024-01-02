package ch20.num2;

import java.util.Arrays;
import java.util.Comparator;

public class chap20_2 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Rang", 29);
        ar[1] = new Person("Go", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar, Comparator.comparingInt(a -> a.name.length()));
        for (Person a : ar) {
            System.out.println(a);
        }
    }
}
