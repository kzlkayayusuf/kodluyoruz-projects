import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pricePear, priceApple, priceTomato, priceBanana, priceAubergine, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        pricePear = 2.14 * input.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        priceApple = 3.67 * input.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        priceTomato = 1.11 * input.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        priceBanana = 0.95 * input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        priceAubergine = 5.00 * input.nextDouble();

        input.close();
        totalPrice = pricePear + priceApple + priceTomato + priceBanana + priceAubergine;

        System.out.print("Toplam Tutar : " + totalPrice);
    }
}
