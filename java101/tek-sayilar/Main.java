import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        } while (number > 0);

        System.out.println("Tek sayıların toplamı: " + total);

        total = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)) {
                total += number;
            }
        } while (!(number % 2 == 1));

        input.close();
        System.out.println("Çift ve 4\'ün katları olan sayıların toplamı: " + total);
    }
}
