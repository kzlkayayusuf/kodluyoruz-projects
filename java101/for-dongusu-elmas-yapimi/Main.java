import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        klavye.close();

        if (n < 0)
            System.out.println("Lütfen pozitif sayı giriniz!");
        System.out.println(n < 0 ? "" : "----For ile Üçgen----");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(n < 0 ? "" : "----While ile Üçgen----");
        int m = 1;
        while (m <= n) {
            int l = 0;
            while (l < (n - m)) {
                System.out.print(" ");
                l++;
            }
            int b = 1;
            while (b <= (2 * m - 1)) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            m++;
        }

        System.out.println(n < 0 ? "" : "----For ile Elmas----");
        for (int i = 1; i < (2 * n); i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = (i - n); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1) && i <= n; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (2 * (2 * n - i) - 1) && i > n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(n < 0 ? "" : "----While ile Elmas----");
        m = 1;
        while (m <= 2 * n) {
            int l = 0;
            while (l < (n - m)) {
                System.out.print(" ");
                l++;
            }
            while (l < (m - n)) {
                System.out.print(" ");
                l++;
            }
            int b = 1;
            while (b <= (2 * m - 1) && m <= n) {
                System.out.print("*");
                b++;
            }
            while (b <= (2 * (2 * n - m) - 1) && m > n) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            m++;
        }
    }
}
