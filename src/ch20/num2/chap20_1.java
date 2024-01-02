package ch20.num2;

import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return (o.age - this.age);
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

}
public class chap20_1 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        for (Person a : ar) {
            System.out.println(a);
        }
    }
}
