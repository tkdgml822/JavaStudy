package ch23;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorIntegerDemo implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
public class chap23_2 {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new ComparatorIntegerDemo());
        tr.add(30);
        tr.add(10);
        tr.add(20);
        System.out.println(tr);
    }


}
