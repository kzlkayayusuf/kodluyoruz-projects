import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        input.close();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        System.out.println(total == number ? number + " Mükemmel sayıdır" : number + " Mükemmel sayı değildir");
    }
}
