package ch21;

class DBox<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }

    public String toString() {
        return left + " & " + right;
    }
}

class DDBox<DL, DR> {
    private DL left;
    private DR right;

    public void set(DL l, DR r) {
        left = l;
        right = r;
    }

    @Override
    public String toString() {
        return left.toString() + " \n " + right.toString();
    }
}

public class chap21_1 {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);

        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);

        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);
        System.out.println(ddbox);
    }
}
