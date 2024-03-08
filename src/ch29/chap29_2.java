package ch29;

import java.util.ArrayList;
import java.util.List;

class ToyStream {
    private String model;
    private int price;

    public ToyStream(String m, int p) {
        model = m;
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
public class chap29_2 {
    public static void main(String[] args) {
        List<ToyStream> ls = new ArrayList<>();
        ls.add(new ToyStream("Gun_LR_45", 200));
        ls.add(new ToyStream("TEDDY_BEAR_S_014", 350));
        ls.add(new ToyStream("CAR_TRANSFORM_VER_7719", 550));

//        int sum = ls.stream()
//                .filter(p -> p.getPrice() < 500)
//                .mapToInt(ToyStream::getPrice)
//                .sum();

//        System.out.println("sum = " + sum);
        ls.stream()
            .filter(p -> p.getModel().length() > 10)
            .map(ToyStream::getModel)
            .forEach(System.out::println);

    }
}
