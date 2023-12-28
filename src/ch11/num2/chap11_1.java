package ch11.num2;

public class chap11_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("990925-1012999");
        stringBuilder.replace(6, 7, " ");
        System.out.println(stringBuilder.toString());
    }
}
