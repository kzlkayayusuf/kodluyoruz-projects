import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, a, nFactorial = 1, rFactorial = 1, aFactorial = 1;
        double combination = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Kombinasyon sayısını giriniz: ");
        r = input.nextInt();
        input.close();

        if (n < r) {
            System.out.println("Kümenin eleman sayısı kombinasyon sayısından küçük olamaz, Lütfen tekrar deneyiniz!");
        } else {

            a = n - r;

            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }
            for (int i = 1; i <= r; i++) {
                rFactorial *= i;
            }
            for (int i = 1; i <= a; i++) {
                aFactorial *= i;
            }

            combination = nFactorial / (rFactorial * aFactorial);
            System.out.println(n + " elemanlı kümenin" + r + "\'li kombinasyonu: " + combination);
        }

    }
}
