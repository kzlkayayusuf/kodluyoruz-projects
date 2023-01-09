package java101.repetitiveNumbers;

import java.util.Arrays;

public class Main {
    static boolean isRepeat(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = { 9, 5, -7, 8, 7, -7, 8, 9, 5, 12, -12, 12, 9, 6, 6, 4, 4, -12 };
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (!isRepeat(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(list) + " dizisindeki tekrar eden çift sayılar: ");
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

    }
}
