import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, power, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        number = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        power = input.nextInt();
        input.close();

        System.out.println("---While Döngüsü ile üslü sayı---");
        int i = 1;
        while (i <= power) {
            total *= number;
            i++;
        }
        System.out.println(number + " üssü " + power + "= " + total);

        System.out.println("---For Döngüsü ile üslü sayı---");
        total = 1;
        for (int k = 1; k <= power; k++) {
            total *= number;
        }
        System.out.println(number + " üssü " + power + "= " + total);
    }
}
