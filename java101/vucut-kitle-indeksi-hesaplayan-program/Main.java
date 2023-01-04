import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // BMI = Body Mass Index/Vücut Kitle İndeksi
        double height, kilo, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        input.close();

        bmi = kilo / (Math.pow(height, 2));
        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}
