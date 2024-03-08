package ch29;

import java.util.Arrays;
import java.util.List;

public class chap29_2_2 {
    public static void main(String[] args) {
        List<Box<String>> ls  = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        ls.stream()
                .map(s -> s.get().length())
                .forEach(System.out::println);
    }
}
