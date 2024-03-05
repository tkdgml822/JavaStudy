package ch28;

import ch22.Box;

import java.util.function.BiFunction;

class chap28_2_1 {
    public static void main(String[] args) {

        // BiFunction 함수형 인터페이스는 BiFunction<T, U, R>이 있으며 R을 반환한다.
        // 즉 이 코드는 apply 함수형에 i랑 s를 저장하겠다는 뜻이다.

        /*
        Box1<Integer, String> apply {
            return new Box<>(i, s)
        }
        */

        BiFunction<Integer, String, Box1<Integer, String>> bf = (i, s) -> new Box1<>(i, s);

        Box1<Integer, String> b1 = bf.apply(1, "Toy");
        Box1<Integer, String> b2 = bf.apply(2, "Robot");

        b1.showIt();
        b2.showIt();
    }
}