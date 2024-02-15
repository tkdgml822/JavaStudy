package ch28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class chap28_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("robot");
        list.add("Lambda");
        list.add("box");
        Collections.sort(list, String::compareToIgnoreCase);
        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(list);

    }
}
