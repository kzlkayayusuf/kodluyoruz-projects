import java.util.Scanner;

public class Main {
    /**
     * @author Yusuf KIZILKAYA,2023
     */
    public static void main(String[] args) {

        double priceUnlessKDV, priceWithKDV, priceKDV, rateOfKDV;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ücret tutarını giriniz: ");

        priceUnlessKDV = input.nextDouble();
        input.close();

        if (priceUnlessKDV < 0) {
            System.out.println("Ücret tutarı negatif olamaz!");
        } else {
            rateOfKDV = (0 <= priceUnlessKDV && priceUnlessKDV <= 1000) ? 0.18 : 0.08;
            priceKDV = priceUnlessKDV * rateOfKDV;
            priceWithKDV = priceKDV + priceUnlessKDV;

            System.out.println("KDV\'siz Fiyat = " + priceUnlessKDV);
            System.out.println("KDV Oranı = " + rateOfKDV);
            System.out.println("KDV Tutarı = " + priceKDV);
            System.out.println("KDV\'li Fiyat = " + priceWithKDV);
        }

    }
}
