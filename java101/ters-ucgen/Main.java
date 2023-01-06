import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz :");
        int n = klavye.nextInt();
        klavye.close();

        if (n < 0)
            System.out.println("Lütfen pozitif sayı giriniz!");

        System.out.println(n < 0 ? "" : "----For ile Ters üçgen----");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(n < 0 ? "" : "----While ile Ters üçgen----");
        int m = 0;
        while (m < n) {
            int l = 1;
            while (l <= (m + 1)) {
                System.out.print(" ");
                l++;
            }
            int b = 1;
            while (b <= (2 * (n - m) - 1)) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            m++;
        }
    }
}
