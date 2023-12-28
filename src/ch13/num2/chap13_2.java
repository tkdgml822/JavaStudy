package ch13.num2;

public class chap13_2 {
    public static void changeArr(int[][] arr) {
        int arrLength = arr.length;
        int[] lastArr = arr[arrLength - 1];

        for (int i = arrLength - 1; i > 0 ; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastArr;
    }

    public static void showArr(int[][] arr) {
        for (int[] ar1 : arr) {
            for (int ar2 : ar1) {
                System.out.print(ar2 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        changeArr(arr);
        showArr(arr);

    }
}
