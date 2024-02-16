package ch28;

import java.util.function.BiFunction;

class Box<T, U> {
    private T id;
    private U con;

    public Box(T i, U c) {
        id = i;
        con = c;
    }

    public void showIt() {
        System.out.println("id :" + id + ", con: " + con);
    }
}

class chap28_2 {
    public static void main(String[] args) {
        BiFunction<Integer, String, Box<Integer, String>> bi = (i, s) -> new Box<>(i, s);

        int id = 0;
        Box<Integer, String> b1 = bi.apply(++id, "robot");
        Box<Integer, String> b2 = bi.apply(++id, "cake");

        b1.showIt();
        b2.showIt();
    }
}