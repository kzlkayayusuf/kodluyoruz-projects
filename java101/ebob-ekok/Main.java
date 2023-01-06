import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2, ebob = 1, ekok = 1, mini;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        number2 = input.nextInt();
        input.close();

        mini = number1 < number2 ? number1 : number2;

        int k = mini;
        while (k >= 1) {
            if (number1 % k == 0 && number2 % k == 0) {
                ebob = k;
                break;
            }
            k--;
        }

        k = 1;
        while (k <= (number1 * number2)) {
            if (k % number1 == 0 && k % number2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println(number1 + " ve " + number2 + " sayılarının EBOB\'u: " + ebob);
        System.out.println(number1 + " ve " + number2 + " sayılarının EKOK\'u: " + ekok);

        ekok = (number1 * number2) / ebob;
        System.out.println("Formul ile ekok= " + ekok);

    }
}
