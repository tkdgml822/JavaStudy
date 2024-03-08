package ch29;

import java.util.Arrays;
import java.util.List;

public class chap29_1_1 {
    public static void main(String[] args) {
        List<Box<String>> ls  = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        ls.stream()
        .map(Box::get)
        .forEach(System.out::println);

        // Box::get 메소드 참조로 변경 Box 클래스에 접근해서 -> get 메소드로 접근
    }
}
