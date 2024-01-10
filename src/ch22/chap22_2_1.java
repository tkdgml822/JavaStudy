package ch22;

public class chap22_2_1 {
    public static <T> boolean compBox(Box<? extends T> box, T con) {
        T bc = box.get();
        return bc.equals(con);
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<String> box2 = new Box<>();
        box2.set("Poly");

        if (compBox(box1, "22 "))
            System.out.println("상자 안에 25저장");
        if (compBox(box2, "Moly"))
            System.out.println("상자 안에 Moly 저장");

        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}
