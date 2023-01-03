import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pricePerKm = 2.20, totalPrice = 10, km;
        int minPrice = 20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi KM cinsinden yazınız: ");
        km = input.nextDouble();
        input.close();

        totalPrice += (km * pricePerKm);
        System.out.println("Toplam Tutar: " + totalPrice);
        System.out.println(totalPrice < minPrice ? "Ödenecek tutar: " + minPrice : "Ödenecek tutar: " + totalPrice);
    }
}
