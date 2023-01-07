import java.util.Scanner;

public class Main {

    static void pattern(int number) {
        System.out.print(number + " ");
        if (number <= 0)
            return;
        pattern(number - 5);
        System.out.print(number + " ");

    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        input.close();
        pattern(number);

    }
}
