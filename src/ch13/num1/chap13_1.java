package ch13.num1;

public class chap13_1 {
    public static int minValue(int[] arr) { // 최솟값 반환
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int maxValue(int[] arr) { // 최댓값 반환
        int max = arr[0];
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
        System.out.println("최대값: " + maxValue(arr));
        System.out.println("최솟값: " + minValue(arr));
    }
}
