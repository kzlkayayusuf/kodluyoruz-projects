import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, maxNumber = 0, minNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        if (n < 0)
            System.out.println("Lütfen pozitif sayı girip tekrar deneyiniz!");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int tempNumber = input.nextInt();
            maxNumber = maxNumber > tempNumber ? maxNumber : tempNumber;
            minNumber = minNumber < tempNumber ? minNumber : tempNumber;
        }

        input.close();
        System.out.println(n < 0 ? "" : "En büyük sayı: " + maxNumber);
        System.out.println(n < 0 ? "" : "En küçük sayı: " + minNumber);

    }
}
