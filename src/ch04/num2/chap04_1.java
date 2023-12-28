package ch04.num2;

public class chap04_1 {
    public static void main(String[] args) {
        byte num1 = (byte)(7);
        num1 = (byte)(~num1);
        num1 = (byte)(num1 + 1);
        System.out.println(num1);
    }
}
