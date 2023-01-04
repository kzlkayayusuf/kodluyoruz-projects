import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = Math.PI, sphere, field, angle;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        sphere = 2 * pi * r;
        field = pi * Math.pow(r, 2);

        System.out.println("Dairenin çevresi: " + sphere);
        System.out.println("Dairenin alanı: " + field);

        System.out.print("Daire Diliminin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Daire Diliminin merkez açısını giriniz: ");
        angle = input.nextDouble();
        input.close();

        sphere = (2 * pi * r * angle) / 360;
        field = (pi * Math.pow(r, 2) * angle) / 360;

        System.out.println("Daire diliminin çevresi: " + sphere);
        System.out.println("Daire diliminin alanı: " + field);

    }
}
