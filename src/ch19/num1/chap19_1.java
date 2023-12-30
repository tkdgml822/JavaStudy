package ch19.num1;

class Point {
    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point)obj;
        return xPos == p.xPos && yPos == p.yPos;
    }

}

class Rectangle {
    private Point upperLeft;
    private Point lowerRight;
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle)obj;
//        return (upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight));
        return (upperLeft == r.upperLeft && lowerRight == r.lowerRight);
    }

}

public class chap19_1 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);

        Rectangle r1 = new Rectangle(1, 2, 4, 5);
        Rectangle r2 = new Rectangle(1, 2, 4, 5);

        if (p1.equals(p2)) {
            System.out.println("같은 값");
        }
        else {
            System.out.println("다른 값");
        }

        if (r1.equals(r2)) {
            System.out.println("같은 값");
        }
        else {
            System.out.println("다른 값");
        }

    }
}
