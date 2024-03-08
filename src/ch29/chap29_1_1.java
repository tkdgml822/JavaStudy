package ch29;

import java.util.Arrays;
import java.util.List;

public class chap29_1_1 {
    public static void main(String[] args) {
        List<Box<String>> ls  = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        ls.stream()
        .map(s -> s.get())
        .forEach(System.out::println);
    }
}
