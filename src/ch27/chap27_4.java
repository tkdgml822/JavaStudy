package ch27;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

class Box<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }

}
public class chap27_4 {
    public static void main(String[] args) {
        BiConsumer<Box<Integer>, Integer> test1 = (b, i) -> b.set(i);
        BiConsumer<Box<Double>, Double> test2 = (b, i) -> b.set(i);

        Box<Integer> bi = new Box<>();
        Box<Double> bd = new Box<>();

        test1.accept(bi, 10);
        test2.accept(bd, 3.1415926535);

        System.out.println(bi.get());
        System.out.println(bd.get());
    }
}
