package ch09.num1;

class Point {
    int xPos, yPos;

    public Point (int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPointInfo() {
        System.out.println("[" + xPos + ", " + yPos + "]");
    }
}

class Circle {
    int radius;

    Point center;
    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public void showCircleInfo() {
        System.out.println("radis :" + radius);
        center.showPointInfo();
    }
}

public class chap09_1 {
    public static void main(String[] args) {
        Circle c = new Circle(2, 2, 4);
        c.showCircleInfo();
    }
}
