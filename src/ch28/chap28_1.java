package ch28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class chap_28_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("robot");
        list.add("Lambda");
        list.add("box");
        Collections.sort(list, String::compareToIgnoreCase); // 대소문자 무시
        System.out.println(list);
    }
}