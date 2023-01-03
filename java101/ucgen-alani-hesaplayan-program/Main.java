import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int leg1, leg2;
        double hypotenuse;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgenin hipotenüsünü bulma:");
        System.out.print("1.Dik Kenarı Giriniz: ");
        leg1 = input.nextInt();
        System.out.print("2.Dik Kenarı Giriniz: ");
        leg2 = input.nextInt();

        hypotenuse = Math.sqrt(Math.pow(leg2, 2) + Math.pow(leg1, 2));
        System.out.println("Hipotenüs: " + hypotenuse);

        int edge1, edge2, edge3;
        double sphere, field, u;
        System.out.println("Üçgen alan hesaplama:");
        System.out.print("1.Kenarı giriniz: ");
        edge1 = input.nextInt();
        System.out.print("2.Kenarı giriniz: ");
        edge2 = input.nextInt();
        System.out.print("3.Kenarı giriniz: ");
        edge3 = input.nextInt();

        sphere = edge1 + edge2 + edge3;
        u = sphere / 2;
        field = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));

        System.out.println("Üçgenin Çevresi: " + sphere);
        System.out.println("Üçgenin alanı: " + field);

        input.close();
    }
}
