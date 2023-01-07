import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int check) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        } else if (number == check) {
            return true;
        } else if (number % check == 0) {
            return false;
        }
        return isPrime(number, check + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, check = 2;

        do {
            System.out.print("Sayı Giriniz: ");
            number = scanner.nextInt();

            System.out
                    .println(number < 0 ? "Negatif asal sayı olmaz, Lütfen tekrar deneyiniz!"
                            : isPrime(number, check) ? number + " sayısı ASALDIR!" : number + " sayısı ASAL değildir!");

        } while (number >= 0);

        scanner.close();
    }
}
