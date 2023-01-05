import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        input.close();
        int decimalPlaces = 0; // basamak sayısı
        int tempNumber = number;
        int placeValue; // basamak değeri
        int totalPlaceValue = 0;
        int result = 0;
        int power;

        while (tempNumber != 0) {
            tempNumber /= 10;
            decimalPlaces++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            placeValue = tempNumber % 10;
            totalPlaceValue += placeValue;
            // 1*1*1*1 = 1^4
            power = 1;
            for (int i = 1; i <= decimalPlaces; i++) {
                power *= placeValue;
            }
            result += power;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

        System.out.println(number + " sayısının basamak sayılarının toplamı: " + totalPlaceValue);

        /*
         * int a = 2451, basamakSayisi = 0, numberCounter = 0;
         * 
         * // Basamak Sayısı Bulma İşlemi
         * // 2451 / 10 = 245
         * // 245 / 10 = 24
         * // 24 / 10 = 2
         * // 2 / 10 = 0
         * // 0 / 10 = 0
         * 
         * while (a != 0) {
         * a /= 10;
         * numberCounter++;
         * }
         * 
         * // Bir sayının son basamağını bulma
         * // 2451 % 10 = 1
         * int b = 2451;
         * int c = b % 10;
         * 
         * int sub = 2, sup = 3;
         * int result = 1;
         * for (int i = 1; i <= sup; i++ ){
         * result *= sub;
         * }
         * System.out.println(result);
         * 
         */

    }
}
