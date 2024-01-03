package ch20.num3;

import java.util.Arrays;

class MyPerson implements Comparable<MyPerson>{
    String name;
    int age;
    public MyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(MyPerson o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
class chap20_1 {
    public static void main(String[] args) {
        MyPerson[] ar = new MyPerson[3];

        ar[0] = new MyPerson("Lee", 29);
        ar[1] = new MyPerson("Goo", 15);
        ar[2] = new MyPerson("Soo", 37);

        Arrays.sort(ar);

        int idx = Arrays.binarySearch(ar, new MyPerson("Goo", 15));
        System.out.println(ar[idx]);
    }
}