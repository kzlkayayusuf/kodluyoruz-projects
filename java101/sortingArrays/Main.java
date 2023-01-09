package java101.sortingArrays;

import java.util.Scanner;

public class Main {

    static int[] receivingArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = input.nextInt();
        }

        input.close();

        return list;
    }

    static void printArray(int[] list) {
        System.out.print("Dizi : { ");
        for (int i : list) {
            System.out.print(i == list[list.length - 1] ? i : i + ", ");
        }
        System.out.println(" }");
    }

    static void sortingArray(int[] list) {
        int min;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] > list[j]) {
                    min = list[i];
                    list[i] = list[j];
                    list[j] = min;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] list = receivingArray();
        printArray(list);
        System.out.println("Sıralama: ");
        sortingArray(list);
        printArray(list);

    }

}
