package ch23;

import java.util.HashSet;
import java.util.Objects;

class Person2 extends CommonPerson {
    public Person2(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class chap23_1_2 {
    public static void main(String[] args) {
        HashSet<Person2> hashSet= new HashSet<>();

        hashSet.add(new Person2("한상희", 25));
        hashSet.add(new Person2("한상희", 25));
        hashSet.add(new Person2("홍길동", 25));
        hashSet.add(new Person2("홍길동", 24));
        hashSet.add(new Person2("라이언", 12));
        hashSet.add(new Person2("라이언", 11));
        hashSet.add(new Person2("라이언", 11));
        hashSet.add(new Person2("라이언", 11));

        for (Person2 person : hashSet) {
            System.out.println(person);
        }
    }
}
