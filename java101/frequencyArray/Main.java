package java101.frequencyArray;

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
            System.out.print(i + ", ");
        }
        System.out.println(" }");
    }

    static boolean isInclude(int[] list, int value) {
        for (int i : list) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void frequencyArray(int[] list) {
        int[] storage = new int[list.length];
        int counter;
        for (int i = 0; i < list.length; i++) {
            counter = 1;
            if (!(isInclude(storage, list[i]))) {
                storage[i] = list[i];
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        counter++;
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
        }
    }

    public static void main(String[] args) {
        int[] list = receivingArray();
        printArray(list);
        frequencyArray(list);
    }

}
