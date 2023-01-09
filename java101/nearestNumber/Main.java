package java101.nearestNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

        System.out.print("Dizi : {");
        for (int i : list) {
            System.out.print(i == list[list.length - 1] ? i : i + ",");
        }
        System.out.println("}");

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        input.close();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        System.out.println("Girilen Sayı: " + number);

        int smallNearest = min;
        int bigNearest = max;

        for (int i : list) {
            if (i < number) {
                smallNearest = (number - smallNearest < number - i) ? smallNearest : i;
            } else if (i > number) {
                bigNearest = (bigNearest - number < i - number) ? bigNearest : i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + bigNearest);
    }
}
