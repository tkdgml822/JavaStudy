package ch11.num1;

public class chap11_1 {
    public static void main(String[] args) {
        String number = "990925-1012999";
        String number1 = number.substring(0, 5) + ' ' + number.substring(7, 14);
        System.out.println(number1);
    }
}
