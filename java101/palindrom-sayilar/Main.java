import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (10 * reverseNumber) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber ? true : false;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        input.close();

        System.out.println(
                isPalindrom(number) ? number + " bir palindrom sayıdır." : number + " palindrom sayı değildir.");

    }
}