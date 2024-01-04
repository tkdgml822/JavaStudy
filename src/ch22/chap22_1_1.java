package ch22;

public class chap22_1_1 {
    public static void addBox(Box<? super Integer> result, Box<? extends Integer> b1, Box<? extends Integer> b2) {
        result.set(b1.get() + b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<Integer> box2 = new Box<>();
        box2.set(37);
        Box<Integer> result = new Box<>();
        result.set(0);
        addBox(result , box1, box2);
        System.out.println(result.get());
    }
}
