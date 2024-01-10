package ch23;

import java.util.HashSet;
import java.util.Objects;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public boolean equals(Object obj) {
        String name = ((Person1) obj).name;
        int age = ((Person1) obj).age;

        return this.name.equals(name) && this.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class chap23_1_2 {
    public static void main(String[] args) {
        HashSet<Person1> hashSet= new HashSet<>();

        hashSet.add(new Person1("한상희", 25));
        hashSet.add(new Person1("한상희", 25));
        hashSet.add(new Person1("홍길동", 25));
        hashSet.add(new Person1("홍길동", 24));
        hashSet.add(new Person1("라이언", 12));
        hashSet.add(new Person1("라이언", 11));
        hashSet.add(new Person1("라이언", 11));
        hashSet.add(new Person1("라이언", 11));

        for (Person1 person : hashSet) {
            System.out.println(person);
        }
    }
}
