package ch23;

import java.util.HashSet;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public boolean equals(Object obj) {
        String name = ((Person) obj).name;
        int age = ((Person) obj).age;

        return this.name.equals(name) && this.age == age;
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode() + (this.age / 2));
    }

}
public class chap23_1_1 {
    public static void main(String[] args) {
        HashSet<Person> hashSet= new HashSet<>();

        hashSet.add(new Person("한상희", 25));
        hashSet.add(new Person("한상희", 25));
        hashSet.add(new Person("홍길동", 25));
        hashSet.add(new Person("홍길동", 24));
        hashSet.add(new Person("라이언", 12));
        hashSet.add(new Person("라이언", 11));
        hashSet.add(new Person("라이언", 11));
        hashSet.add(new Person("라이언", 11));

        for (Person person : hashSet) {
            System.out.println(person);
        }
    }


}
