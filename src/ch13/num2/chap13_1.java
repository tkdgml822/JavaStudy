package ch13.num2;

public class chap13_1 {
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for (int[] ints : arr) {
            addOneDArr(ints, add);
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        addTwoDArr(arr, 10);

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
