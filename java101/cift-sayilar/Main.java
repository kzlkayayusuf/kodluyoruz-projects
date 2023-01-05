import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, count, sum;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        input.close();

        System.out.println("----Çift Sayılar For Döngüsü----");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("----Çift Sayılar While Döngüsü----");
        int j = 1;
        while (j <= number) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("----Ortalama Hesaplama For Döngüsü----");
        count = 0;
        sum = 0;
        for (int k = 0; k <= number; k++) {
            if ((k % 3) == 0 && (k % 4) == 0) {
                sum += k;
                count++;
            }
        }
        average = sum / count;
        System.out.println("Ortalama: " + average);

        System.out.println("----Ortalama Hesaplama While Döngüsü----");
        count = 0;
        sum = 0;
        j = 0;
        while (j <= number) {
            if ((j % 3) == 0 && (j % 4) == 0) {
                sum += j;
                count++;
            }
            j++;
        }
        average = sum / count;
        System.out.println("Ortalama: " + average);
    }
}
