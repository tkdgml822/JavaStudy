package ch07.num1;

class Triangel {
    static double base; // 밑변
    static double height; // 높이
    public Triangel(int b, int h) {
        base = b;
        height = h;
    }

    public static double area() {
        return (base * height) / 2;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setBase(int b) {
        base = b;
    }
}

public class chap07_1 {
    public static void main(String[] args) {
        Triangel triangel = new Triangel(10, 10);
        System.out.println("넓이 : " + triangel.area());
        triangel.setHeight(5);
        triangel.setBase(5);
        System.out.println("넓이 : " + triangel.area());
    }
}
