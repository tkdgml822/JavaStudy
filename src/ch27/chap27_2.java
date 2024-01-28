package ch27;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class chap27_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robot");
        list.add("Lambda");
        list.add("Box");

        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());    // 정렬

        for(String s : list)
            System.out.println(s);
    }
}