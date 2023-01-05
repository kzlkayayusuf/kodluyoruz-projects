import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, age, tripType;
        double pricePerKm = 0.10, totalPrice, discountPrice, discountRate, tripTypeDiscountRate;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();
        input.close();

        discountRate = (age < 12) ? 0.5 : (age >= 12 && age <= 24) ? 0.1 : (age > 65) ? 0.3 : 0;
        tripTypeDiscountRate = (tripType == 1) ? 0 : 0.2;

        if ((km > 0 && age > 0) && (tripType == 1 || tripType == 2)) {
            totalPrice = km * pricePerKm;
            discountPrice = totalPrice - (totalPrice * discountRate);
            totalPrice = discountPrice - (discountPrice * tripTypeDiscountRate);
            totalPrice = (tripType == 1) ? totalPrice : totalPrice * 2;
            System.out.println("Toplam Tutar= " + totalPrice);
        } else {
            System.out.println("Hatalı Veri Girdiniz, Lütfen tekrar deneyiniz!");
        }

    }
}
