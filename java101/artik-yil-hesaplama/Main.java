import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        boolean isLeapYear;
        String message;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        input.close();

        if (year < 0) {
            System.out.println("Yıl sıfırdan küçük olamaz, Lütfen tekrar deneyiniz!");
        } else {
            if (year % 100 == 0) {
                isLeapYear = (year % 400) == 0 ? true : false;
            } else {
                isLeapYear = (year % 4) == 0 ? true : false;
            }

            message = isLeapYear ? " bir artık yıldır!" : " bir artık yıl değildir!";
            System.out.println(year + message);
        }

    }
}
