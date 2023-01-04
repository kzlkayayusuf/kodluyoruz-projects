import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3, bigNumber, smallNumber, midNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        number1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.print("3. Sayıyı Giriniz : ");
        number3 = input.nextInt();

        input.close();
        bigNumber = (number1 > number2 && number1 > number3) ? number1
                : (number2 > number1 && number2 > number3) ? number2 : number3;
        smallNumber = (number1 < number2 && number1 < number3) ? number1
                : (number2 < number1 && number2 < number3) ? number2 : number3;
        midNumber = ((bigNumber == number2 && smallNumber == number3)
                || (bigNumber == number3 && smallNumber == number2)) ? number1
                        : ((bigNumber == number3 && smallNumber == number1)
                                || (bigNumber == number1 && smallNumber == number3)) ? number2 : number3;

        System.out.println(
                "Girilen Numaraların büyükten küçüğe sıralaması: " + bigNumber + ">" + midNumber + ">" + smallNumber);
        System.out.println(
                "Girilen Numaraların küçükten büyüğe sıralaması: " + smallNumber + "<" + midNumber + "<" + bigNumber);
    }
}
