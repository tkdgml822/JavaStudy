package ch28;

import java.util.function.BiFunction;

class Box2<T, U> {
    private T id;
    private U con;
    public Box2(T t, U u) {
        id = t;
        con = u;
    }

    public void showIt() {
        System.out.println("id : " + id + ", con :" + con);
    }
}

public class chap28_2_2 {
    public static void main(String[] args) {
        BiFunction<Integer, String, Box<Integer, String>> bf = Box::new;

        int i = 0;
        Box<Integer, String> b1 = bf.apply(++i, "Box");
        Box<Integer, String> b2 = bf.apply(++i, "Robot");
        b1.showIt();
        b2.showIt();
    }
}
