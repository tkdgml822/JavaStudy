package ch23.test;

import java.util.HashSet;

class Person1 extends CommonPerson {
    public Person1(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (age % 7);
    }
}

public class chap23_1_1 {
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
