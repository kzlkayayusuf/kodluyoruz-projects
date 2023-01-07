import java.util.Scanner;

public class Main {

    static double power(int base, int exponent) {

        double baseTemp = base;
        baseTemp = exponent > 0 ? baseTemp : (1 / baseTemp);
        int exponentTemp = exponent > 0 ? exponent - 1 : exponent + 1;

        if (exponent == 0)
            return 1;

        double result = baseTemp * power(base, exponentTemp);
        return result;
    }

    public static void main(String[] args) {
        int base, exponent;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exponent = input.nextInt();
        input.close();
        result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
