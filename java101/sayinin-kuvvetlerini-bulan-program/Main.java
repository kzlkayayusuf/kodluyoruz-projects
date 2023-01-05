import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        number = input.nextInt();
        input.close();

        System.out.println("---2\'nin kuvvetleri For döngüsü---");
        for (int i = 1; i <= number; i *= 2) {
            System.out.println(i);
        }

        System.out.println("---4\'ün kuvvetleri For döngüsü---");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("---5\'in kuvvetleri For döngüsü---");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }

        System.out.println("---2\'nin kuvvetleri While döngüsü---");
        int j = 1;
        while (j <= number) {
            System.out.println(j);
            j *= 2;
        }

        System.out.println("---4\'ün kuvvetleri While döngüsü---");
        j = 1;
        while (j <= number) {
            System.out.println(j);
            j *= 4;
        }

        System.out.println("---5\'in kuvvetleri While döngüsü---");
        j = 1;
        while (j <= number) {
            System.out.println(j);
            j *= 5;
        }

    }
}
